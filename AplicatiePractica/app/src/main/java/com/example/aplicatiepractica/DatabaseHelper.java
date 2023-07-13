package com.example.aplicatiepractica;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {
    private Context context;
    public static final String DATABASE_NAME="poze.db";
    public static final int DATABASE_VERSION=1;
    public static final String TABLE_NAME="pozele_votate";
    public static final String COLUMN_ID="id";
    public static final String COLUMN_NAME="nume";
    public static final String COLUMN_VOTES="voturi";

    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query=" CREATE TABLE " + TABLE_NAME +
                " (" + COLUMN_ID + "INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_NAME + " TEXT, " +
                COLUMN_VOTES + " TEXT);";
        db.execSQL(query);

        List<Integer> listaPoze= Arrays.asList(
                R.drawable.alpaca,
                R.drawable.caine,
                R.drawable.capybara,
                R.drawable.delfin,
                R.drawable.kuoka,
                R.drawable.panda,
                R.drawable.pisic,
                R.drawable.veverita,
                R.drawable.vulpe,
                R.drawable.vidra,
                R.drawable.bmw,
                R.drawable.eos,
                R.drawable.fiat,
                R.drawable.ford,
                R.drawable.honda,
                R.drawable.lamborghini,
                R.drawable.mercedes,
                R.drawable.nissan,
                R.drawable.porche,
                R.drawable.tesla,
                R.drawable.toyota,
                R.drawable.braila,
                R.drawable.roma,
                R.drawable.constanta,
                R.drawable.sighisoara,
                R.drawable.bergamo,
                R.drawable.timisoara,
                R.drawable.brasov,
                R.drawable.bucuresti,
                R.drawable.galati
        );
        insertPozeFromResources(listaPoze);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
    db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
    onCreate(db);
    }
    public void insertPoza(String nume, String voturi) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_NAME, nume);
        values.put(COLUMN_VOTES, voturi);
        db.insert(TABLE_NAME, null, values);
        db.close();
    }
    public void updatePoza(int id, String nume, String voturi) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_NAME, nume);
        values.put(COLUMN_VOTES, voturi);
        db.update(TABLE_NAME, values, COLUMN_ID + " = ?", new String[]{String.valueOf(id)});
        db.close();
    }
    public void deletePoza(int id) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_NAME, COLUMN_ID + " = ?", new String[]{String.valueOf(id)});
        db.close();
    }
    public void updateVotes(int id) {
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "UPDATE " + TABLE_NAME +
                " SET " + COLUMN_VOTES + " = " + COLUMN_VOTES + " + 1" +
                " WHERE " + COLUMN_ID + " = " + id;
        db.execSQL(query);
        db.close();
    }

    private String getNumePozaFromResource(int resourceId) {
        Resources resources = context.getResources();
        String resourceName = resources.getResourceName(resourceId);
        String packageName = context.getPackageName();
        return resourceName.substring(packageName.length() + 1);
    }

    public void insertPozeFromResources(List<Integer> listaPoze) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        for (int resourceId : listaPoze) {
            String numePoza = getNumePozaFromResource(resourceId);
            values.put(COLUMN_NAME, numePoza);
            values.put(COLUMN_VOTES, "0");
            db.insert(TABLE_NAME, null, values);
            values.clear();
        }

        db.close();
    }


}
