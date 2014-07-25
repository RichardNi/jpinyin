package jpinyin.opensource.jpinyin;

import opensource.jpinyin.PinyinFormat;
import opensource.jpinyin.PinyinHelper;

/**
 * @author Zero
 */
public class TestPinyinHelper {
    public static void main(String[] args) {
        System.out.println(PinyinHelper.convertToPinyinString("你好啊！！", ","));
        System.out.println(PinyinHelper.convertToPinyinString("你好啊！！", ",",
                PinyinFormat.WITHOUT_TONE));
        //不带声调
        System.out.println(PinyinHelper.convertToPinyinString("重", ",",
                PinyinFormat.WITHOUT_TONE));
        //带声调
        System.out.println(PinyinHelper.convertToPinyinString("重", ",",
                PinyinFormat.WITH_TONE_MARK));

        System.out.println(PinyinHelper.convertToPinyinString("重", ",",
                PinyinFormat.WITH_TONE_NUMBER));

        System.out.println("============================");
        String[] str = PinyinHelper.convertToPinyinArray('重', PinyinFormat.WITHOUT_TONE);
        for (String s : str) {
            System.out.println(s);
        }

    }
}
