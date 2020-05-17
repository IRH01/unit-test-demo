package com.yunji.unit.base;

import com.alibaba.fastjson.JSONObject;
import com.yunji.unit.entity.CreditChannel;
import org.springframework.core.io.ClassPathResource;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Description 测试mock工具，将json文件内容读出
 *
 * @author Created by Iritchie.ren on 2019/03/24.
 */
public final class JsonFileUtil {

    public static String mockString(String filePath) throws Exception {
        ClassPathResource resource = new ClassPathResource(filePath);
        BufferedReader reader = new BufferedReader(new FileReader(resource.getFile()));
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
