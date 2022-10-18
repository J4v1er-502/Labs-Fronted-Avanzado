package com.example.lab8_plataformas.datasource.local;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.lab8_plataformas.datasource.model.dataCharacters;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ResultDao_Impl implements ResultDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<dataCharacters> __insertionAdapterOfdataCharacters;

  private final EntityDeletionOrUpdateAdapter<dataCharacters> __deletionAdapterOfdataCharacters;

  private final EntityDeletionOrUpdateAdapter<dataCharacters> __updateAdapterOfdataCharacters;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public ResultDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfdataCharacters = new EntityInsertionAdapter<dataCharacters>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `dataCharacters` (`id`,`episode`,`gender`,`image`,`name`,`origin`,`species`,`status`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, dataCharacters value) {
        stmt.bindLong(1, value.getId());
        if (value.getEpisode() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getEpisode());
        }
        if (value.getGender() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getGender());
        }
        if (value.getImage() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getImage());
        }
        if (value.getName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getName());
        }
        if (value.getOrigin() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getOrigin());
        }
        if (value.getSpecies() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getSpecies());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getStatus());
        }
      }
    };
    this.__deletionAdapterOfdataCharacters = new EntityDeletionOrUpdateAdapter<dataCharacters>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `dataCharacters` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, dataCharacters value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfdataCharacters = new EntityDeletionOrUpdateAdapter<dataCharacters>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `dataCharacters` SET `id` = ?,`episode` = ?,`gender` = ?,`image` = ?,`name` = ?,`origin` = ?,`species` = ?,`status` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, dataCharacters value) {
        stmt.bindLong(1, value.getId());
        if (value.getEpisode() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getEpisode());
        }
        if (value.getGender() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getGender());
        }
        if (value.getImage() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getImage());
        }
        if (value.getName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getName());
        }
        if (value.getOrigin() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getOrigin());
        }
        if (value.getSpecies() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getSpecies());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getStatus());
        }
        stmt.bindLong(9, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM dataCharacters";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final dataCharacters user, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfdataCharacters.insert(user);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final dataCharacters user,
      final Continuation<? super Integer> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        int _total = 0;
        __db.beginTransaction();
        try {
          _total +=__deletionAdapterOfdataCharacters.handle(user);
          __db.setTransactionSuccessful();
          return _total;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final dataCharacters user, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfdataCharacters.handle(user);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteAll(final Continuation<? super Integer> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
        __db.beginTransaction();
        try {
          final java.lang.Integer _result = _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAll.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object getUsers(final Continuation<? super List<dataCharacters>> continuation) {
    final String _sql = "SELECT * FROM dataCharacters";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<dataCharacters>>() {
      @Override
      public List<dataCharacters> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfEpisode = CursorUtil.getColumnIndexOrThrow(_cursor, "episode");
          final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfOrigin = CursorUtil.getColumnIndexOrThrow(_cursor, "origin");
          final int _cursorIndexOfSpecies = CursorUtil.getColumnIndexOrThrow(_cursor, "species");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final List<dataCharacters> _result = new ArrayList<dataCharacters>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final dataCharacters _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final Integer _tmpEpisode;
            if (_cursor.isNull(_cursorIndexOfEpisode)) {
              _tmpEpisode = null;
            } else {
              _tmpEpisode = _cursor.getInt(_cursorIndexOfEpisode);
            }
            final String _tmpGender;
            if (_cursor.isNull(_cursorIndexOfGender)) {
              _tmpGender = null;
            } else {
              _tmpGender = _cursor.getString(_cursorIndexOfGender);
            }
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpOrigin;
            if (_cursor.isNull(_cursorIndexOfOrigin)) {
              _tmpOrigin = null;
            } else {
              _tmpOrigin = _cursor.getString(_cursorIndexOfOrigin);
            }
            final String _tmpSpecies;
            if (_cursor.isNull(_cursorIndexOfSpecies)) {
              _tmpSpecies = null;
            } else {
              _tmpSpecies = _cursor.getString(_cursorIndexOfSpecies);
            }
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            _item = new dataCharacters(_tmpId,_tmpEpisode,_tmpGender,_tmpImage,_tmpName,_tmpOrigin,_tmpSpecies,_tmpStatus);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Object getUserById(final int id, final Continuation<? super dataCharacters> continuation) {
    final String _sql = "SELECT * FROM dataCharacters WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<dataCharacters>() {
      @Override
      public dataCharacters call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfEpisode = CursorUtil.getColumnIndexOrThrow(_cursor, "episode");
          final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfOrigin = CursorUtil.getColumnIndexOrThrow(_cursor, "origin");
          final int _cursorIndexOfSpecies = CursorUtil.getColumnIndexOrThrow(_cursor, "species");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final dataCharacters _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final Integer _tmpEpisode;
            if (_cursor.isNull(_cursorIndexOfEpisode)) {
              _tmpEpisode = null;
            } else {
              _tmpEpisode = _cursor.getInt(_cursorIndexOfEpisode);
            }
            final String _tmpGender;
            if (_cursor.isNull(_cursorIndexOfGender)) {
              _tmpGender = null;
            } else {
              _tmpGender = _cursor.getString(_cursorIndexOfGender);
            }
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpOrigin;
            if (_cursor.isNull(_cursorIndexOfOrigin)) {
              _tmpOrigin = null;
            } else {
              _tmpOrigin = _cursor.getString(_cursorIndexOfOrigin);
            }
            final String _tmpSpecies;
            if (_cursor.isNull(_cursorIndexOfSpecies)) {
              _tmpSpecies = null;
            } else {
              _tmpSpecies = _cursor.getString(_cursorIndexOfSpecies);
            }
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            _result = new dataCharacters(_tmpId,_tmpEpisode,_tmpGender,_tmpImage,_tmpName,_tmpOrigin,_tmpSpecies,_tmpStatus);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
