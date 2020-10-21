package com.example.app;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "workersDb";
    public static final String TABLE_NAME = "workers";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_F_NAME = "f_name";
    public static final String COLUMN_L_NAME = "l_name";
    public static final String COLUMN_BIRTHDAY = "birthday";
    public static final String COLUMN_SPECIALTY = "specialty";

    public DBHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table " + TABLE_NAME +
                "(" + COLUMN_ID + " integer primary key autoincrement," + COLUMN_F_NAME + " text," + COLUMN_L_NAME + " text," + COLUMN_BIRTHDAY + " text,"
                 + COLUMN_SPECIALTY + " text" + ")");

        ContentValues contentValues = new ContentValues();

        contentValues.put(DBHelper.COLUMN_F_NAME, "Иван");
        contentValues.put(DBHelper.COLUMN_L_NAME, "Иванов");
        contentValues.put(DBHelper.COLUMN_BIRTHDAY, "23.03.1987");
        contentValues.put(DBHelper.COLUMN_SPECIALTY, "Менеджер");
        sqLiteDatabase.insert(DBHelper.TABLE_NAME, null, contentValues);

        contentValues.put(DBHelper.COLUMN_F_NAME, "Петр");
        contentValues.put(DBHelper.COLUMN_L_NAME, "Петров");
        contentValues.put(DBHelper.COLUMN_BIRTHDAY, "null");
        contentValues.put(DBHelper.COLUMN_SPECIALTY, "Менеджер");
        sqLiteDatabase.insert(DBHelper.TABLE_NAME, null, contentValues);

        contentValues.put(DBHelper.COLUMN_F_NAME, "Вася");
        contentValues.put(DBHelper.COLUMN_L_NAME, "Пупкин");
        contentValues.put(DBHelper.COLUMN_BIRTHDAY, "29.11.1985");
        contentValues.put(DBHelper.COLUMN_SPECIALTY, "Менеджер");
        sqLiteDatabase.insert(DBHelper.TABLE_NAME, null, contentValues);

        contentValues.put(DBHelper.COLUMN_F_NAME, "Екатерина");
        contentValues.put(DBHelper.COLUMN_L_NAME, "Пертрова");
        contentValues.put(DBHelper.COLUMN_BIRTHDAY, "07.01.1990");
        contentValues.put(DBHelper.COLUMN_SPECIALTY, "Разработчик");
        sqLiteDatabase.insert(DBHelper.TABLE_NAME, null, contentValues);

        contentValues.put(DBHelper.COLUMN_F_NAME, "Николай");
        contentValues.put(DBHelper.COLUMN_L_NAME, "Сидоров");
        contentValues.put(DBHelper.COLUMN_BIRTHDAY, "");
        contentValues.put(DBHelper.COLUMN_SPECIALTY, "Разработчик");
        sqLiteDatabase.insert(DBHelper.TABLE_NAME, null, contentValues);

        contentValues.put(DBHelper.COLUMN_F_NAME, "Виктор");
        contentValues.put(DBHelper.COLUMN_L_NAME, "Федотов");
        contentValues.put(DBHelper.COLUMN_BIRTHDAY, "23.07.2000");
        contentValues.put(DBHelper.COLUMN_SPECIALTY, "Разработчик");
        sqLiteDatabase.insert(DBHelper.TABLE_NAME, null, contentValues);

        contentValues.put(DBHelper.COLUMN_F_NAME, "Артур");
        contentValues.put(DBHelper.COLUMN_L_NAME, "Варламов");
        contentValues.put(DBHelper.COLUMN_BIRTHDAY, "23.07.2000");
        contentValues.put(DBHelper.COLUMN_SPECIALTY, "Разработчик");
        sqLiteDatabase.insert(DBHelper.TABLE_NAME, null, contentValues);

        contentValues.put(DBHelper.COLUMN_F_NAME, "Руслан");
        contentValues.put(DBHelper.COLUMN_L_NAME, "Русланов");
        contentValues.put(DBHelper.COLUMN_BIRTHDAY, "17.10.1984");
        contentValues.put(DBHelper.COLUMN_SPECIALTY, "Разработчик");
        sqLiteDatabase.insert(DBHelper.TABLE_NAME, null, contentValues);

        contentValues.put(DBHelper.COLUMN_F_NAME, "Владимир");
        contentValues.put(DBHelper.COLUMN_L_NAME, "Миронов");
        contentValues.put(DBHelper.COLUMN_BIRTHDAY, "03.08.1972");
        contentValues.put(DBHelper.COLUMN_SPECIALTY, "Разработчик");
        sqLiteDatabase.insert(DBHelper.TABLE_NAME, null, contentValues);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists " + TABLE_NAME);
    }
}
