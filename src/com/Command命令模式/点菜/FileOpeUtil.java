package com.Command命令模式.点菜;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName FileOpeUtil
 * @Description 读写文件的辅助工具类
 * @Author deus
 * @Data 2018/9/13 16:53
 * @Version 1.0
 **/
public class FileOpeUtil {
    //私有化构造函数，避免创建类的实例
    private FileOpeUtil() {
    }

    //读文件
    public static List readFile(String pathName) {
        List list = new ArrayList();
        ObjectInputStream oin = null;
        try {
            File f = new File(pathName);
            if (f.exists()) {
                oin = new ObjectInputStream(
                        new BufferedInputStream(
                                new FileInputStream(f)
                        )
                );
                list = (List) oin.readObject();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (oin != null) {
                    oin.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return list;
    }

    public static void writeFile(String pathName, List list) {
        File f = new File(pathName);
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(f)
                    )
            );
            out.writeObject(list);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try{
                out.close();
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
    }
}
