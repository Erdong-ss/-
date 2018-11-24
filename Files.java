import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Files {
    public String filename;
    public String str;
    public List<Words> words;
    public Files(String filename,String str){
        str = str.replaceAll("[\\pP‘’“”]", "");
        str=str.toLowerCase();
        this.str=str;
        this.filename=filename;
    }
    public String [] getStringArray(){

      //使用map实现去重功能
        Map<String,String> map=new HashMap<>();
        str = str.replaceAll("[\\pP‘’“”]", "");
        for (String s:str.split(" ")) {
            map.put(s,s);
        }
        str=map.keySet().toString();
        str = str.replaceAll("[\\pP‘’“”]", "");
        System.out.println(str);
        return str.split(" ");
    }

    @Override
    public String toString() {
        return  filename;
    }
}

