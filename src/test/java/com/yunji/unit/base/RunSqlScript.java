package com.yunji.unit.base;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.junit.Test;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

/**
 * Description 测试配置，执行sql脚本文件
 *
 * @author Created by Iritchie.ren on 2019/03/24.
 */
public final class RunSqlScript {

    /**
     * <p>运行指定的sql脚本
     *
     * @param sqlPath 需要执行的sql脚本的路径
     */
    public static void run(String sqlPath) {
        if (StringUtils.isEmpty(sqlPath)) {
            return;
        }
        try {
            Connection conn = getConnection();
            ScriptRunner runner = getScriptRunner(conn);
            // 执行SQL脚本
            Resources.setCharset(StandardCharsets.UTF_8);
            Reader resourceAsReader = Resources.getResourceAsReader(sqlPath);
            runner.runScript(resourceAsReader);
            // 关闭连接
            conn.close();

            // 若成功，打印提示信息
            System.out.println("====== RUN " + sqlPath + " SCRIPT SUCCESS ======");
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * <p>批量运行指定的sql脚本
     *
     * @param sqlPathList 需要执行的sql脚本的路径列表
     */
    public static void run(List<String> sqlPathList) {
        if (sqlPathList == null || sqlPathList.isEmpty()) {
            return;
        }
        try {
            Connection conn = getConnection();
            ScriptRunner runner = getScriptRunner(conn);
            // 执行SQL脚本
            for (String sqlPath : sqlPathList) {
                if (StringUtils.isEmpty(sqlPath)) {
                    continue;
                }
                try {
                    Resources.setCharset(StandardCharsets.UTF_8);
                    Reader resourceAsReader = Resources.getResourceAsReader(sqlPath);
                    runner.runScript(resourceAsReader);
                    // 若成功，打印提示信息
                    System.out.println("====== RUN " + sqlPath + " SCRIPT SUCCESS ======");
                } catch (IOException e) {
                    System.err.println("!!!!!!!!!执行sql脚本失败：" + sqlPath + "!!!!!! \n " + e);
                }
            }
            // 关闭连接
            conn.close();
        } catch (Exception ex) {
            System.err.println("!!!!!!!!!连接数据失败 \n " + ex);
        }
    }

    private static Connection getConnection() throws SQLException, IOException {
        // 获取数据库相关配置信息
        Properties props = Resources.getResourceAsProperties("unit_test_data_source.properties");
        // jdbc 连接信息: 注: 现在版本的JDBC不需要配置driver，因为不需要Class.forName手动加载驱动
        String url = props.getProperty("spring.datasource.url");
        String username = props.getProperty("spring.datasource.username");
        String password = props.getProperty("spring.datasource.password");

        // 建立连接
        return DriverManager.getConnection(url, username, password);
    }

    private static ScriptRunner getScriptRunner(Connection conn) throws IOException, SQLException {
        // 创建ScriptRunner，用于执行SQL脚本
        ScriptRunner runner = new ScriptRunner(conn);
        runner.setErrorLogWriter(null);
        runner.setLogWriter(null);
        return runner;
    }

    @Test
    public void testRunSqlScript() {
        RunSqlScript.run("testsql/schema.sql");
    }
}