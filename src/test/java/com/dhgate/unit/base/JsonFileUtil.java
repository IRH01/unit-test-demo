package com.dhgate.unit.base;

import com.alibaba.fastjson.JSONObject;
import com.dhgate.unit.entity.CreditChannel;
import org.springframework.core.io.ClassPathResource;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * Description 测试mock工具，将json文件内容读出
 *
 * @author Created by Iritchie.ren on 2019/03/24.
 */
public final class JsonFileUtil {

    public static String mockString(String filePath) throws Exception {
        ClassPathResource resource = new ClassPathResource(filePath);
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(resource.getFile()), StandardCharsets.UTF_8);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        return sb.toString();
    }

    public static CreditChannel buildFindDataResult() throws Exception {
        String mockStr = mockString("/mock/mock_demo_result.json");
        return JSONObject.parseObject(mockStr, CreditChannel.class);
    }
}
