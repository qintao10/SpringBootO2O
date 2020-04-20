package com.yingsh.o2o.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Created by qt on 2020/4/11.
 */
@Configuration
public class PathUtil {
    private static String separator = System.getProperty("file.separator");   //得到读取系统的文件分割符
    private static String os = System.getProperty("os.name");        //得到读取什么系统
    private static Logger logger = LoggerFactory.getLogger(PathUtil.class);

    private static String winPath;

    private static String linuxPath;

    private static String shopPath;

    private static String headLinePath;

    private static String shopCategoryPath;

    @Value("${win.base.path}")
    public void setWinPath(String winPath) {
        PathUtil.winPath = winPath;
    }

    @Value("${linux.base.path}")
    public void setLinuxPath(String linuxPath) {
        PathUtil.linuxPath = linuxPath;
    }

    @Value("${shop.relevant.path}")
    public void setShopPath(String shopPath) {
        PathUtil.shopPath = shopPath;
    }

    @Value("${headline.relevant.path}")
    public void setHeadLinePath(String headLinePath) {
        PathUtil.headLinePath = headLinePath;
    }

    @Value("${shopcategory.relevant.path}")
    public void setShopCategoryPath(String shopCategoryPath) {
        PathUtil.shopCategoryPath = shopCategoryPath;
    }

    //图片绝对路径
    public static String getImgBasePath() {
        String basePath = "";
        logger.debug("操作系统名称:" + os.toLowerCase());
        if (os.toLowerCase().equals("windows 10")) {
            basePath = winPath;
        } else {
            basePath = linuxPath;
        }
        basePath = basePath.replace("/", separator);
        return basePath;
    }

    //各店铺图片相对路径
    public static String getShopImagePath(Long shopId) {
        String imagePath = "";
        imagePath = shopPath + shopId + separator;
        return imagePath.replace("/", separator);
    }

    public static String getHeadLineImagePath() {
        return headLinePath.replace("/", separator);
    }

    public static String getShopCategoryPath() {
        return shopCategoryPath.replace("/", separator);
    }
}
