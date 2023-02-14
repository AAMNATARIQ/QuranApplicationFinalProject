package amnatariq.org.quranapplicationfinalproject;

public class QuranModel
{
    public int number;
    public String text;
    public int numberInSurah;
    public int juz;
    public int manzil;
    public int page;
    public int ruku;
    public int hizbQuarter;
    public int sajda;
    public int surah_number;
    public String surah_name;
    public String englishName;
    public String englishNameTransaltion;
    public String revelationType;
    public int sajda_id;
    public int sajda_recommended;
    public int sajda_obligatory;
    public String UrduTransaltion;
    public String UrduTafseer;
    public String EnglishTranslation;
    public String EnglishTafseer;
    public String SindhiTranslation;
    public String SindhiTafseer;
    public String HindiTranslation;
    public String HindiTafseer;
    public String PushtuTranslation;
    public String PushtoTafseer;

    public QuranModel(int number, String text, int numberInSurah, int juz, int manzil, int page, int ruku, int hizbQuarter, int sajda, int surah_number, String surah_name, String englishName, String englishNameTransaltion, String revelationType, int sajda_id, int sajda_recommended, int sajda_obligatory, String urduTransaltion, String urduTafseer, String englishTranslation, String englishTafseer, String sindhiTranslation, String sindhiTafseer, String hindiTranslation, String hindiTafseer, String pushtuTranslation, String pushtoTafseer) {
        this.number = number;
        this.text = text;
        this.numberInSurah = numberInSurah;
        this.juz = juz;
        this.manzil = manzil;
        this.page = page;
        this.ruku = ruku;
        this.hizbQuarter = hizbQuarter;
        this.sajda = sajda;
        this.surah_number = surah_number;
        this.surah_name = surah_name;
        this.englishName = englishName;
        this.englishNameTransaltion = englishNameTransaltion;
        this.revelationType = revelationType;
        this.sajda_id = sajda_id;
        this.sajda_recommended = sajda_recommended;
        this.sajda_obligatory = sajda_obligatory;
        this.UrduTransaltion = urduTransaltion;
        this.UrduTafseer = urduTafseer;
        this.EnglishTranslation = englishTranslation;
        this.EnglishTafseer = englishTafseer;
        this.SindhiTranslation = sindhiTranslation;
        this.SindhiTafseer = sindhiTafseer;
        this.HindiTranslation = hindiTranslation;
        this.HindiTafseer = hindiTafseer;
        this.PushtuTranslation = pushtuTranslation;
        this.PushtoTafseer = pushtoTafseer;
    }
}
