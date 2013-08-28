package models;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;

import java.io.File;
import java.util.*;


/**
 * Created with IntelliJ IDEA.
 * User: fdong
 * Date: 8/20/13
 * Time: 9:53 AM
 * To change this template use File | Settings | File Templates.
 */
public class DataItem {
    /*
    public String fileName;
    public String filePath;*/
    private static String localDataPath = "/data/sample_data/";


    public DataItem() {
        /*this.fileName = fileName;
        this.filePath = filePath;*/
    }

    public static List<File> getDataFromGrid() {

        File root = new File(localDataPath);
        List<File> results = (List<File>) FileUtils.listFiles(root, TrueFileFilter.INSTANCE, TrueFileFilter.INSTANCE);


        return results;
    }
}
