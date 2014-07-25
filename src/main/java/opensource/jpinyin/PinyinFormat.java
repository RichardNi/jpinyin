package opensource.jpinyin;

/**
 * 拼音格式类
 *
 * @author stuxuhai (dczxxuhai@gmail.com)
 * @version 1.0
 * @created 2013-5-15
 */
public class PinyinFormat
{
    private String name;
    /**带声调的拼音*/
    public static final PinyinFormat WITH_TONE_MARK = new PinyinFormat("WITH_TONE_MARK");
    /**
     * 不带声调的拼音
     */
    public static final PinyinFormat WITHOUT_TONE = new PinyinFormat("WITHOUT_TONE");
    /**
     * 用数字表示声调
     */
    public static final PinyinFormat WITH_TONE_NUMBER = new PinyinFormat("WITH_TONE_NUMBER");

    protected PinyinFormat(String name)
    {
        this.name = name;
    }

    protected String getName()
    {
        return this.name;
    }
}
