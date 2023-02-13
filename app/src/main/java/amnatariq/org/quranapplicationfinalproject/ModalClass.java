package amnatariq.org.quranapplicationfinalproject;

public class ModalClass {
    public String SurahName;
    public String SurahType;

    public ModalClass(String surahName, String surahType) {
        SurahName = surahName;
        SurahType = surahType;
    }

    public String getSurahName() {
        return SurahName;
    }

    public void setSurahName(String surahName) {
        SurahName = surahName;
    }

    public String getSurahType() {
        return SurahType;
    }

    public void setSurahType(String surahType) {
        SurahType = surahType;
    }
}
