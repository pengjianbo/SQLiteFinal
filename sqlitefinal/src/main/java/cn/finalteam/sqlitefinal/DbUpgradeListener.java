package cn.finalteam.sqlitefinal;

/**
 * Desction:数据库更新事件
 * Author:pengjianbo
 * Date:15/7/6 上午10:36
 */
public interface DbUpgradeListener {
    public void onUpgrade(DbHelper db, int oldVersion, int newVersion);
}
