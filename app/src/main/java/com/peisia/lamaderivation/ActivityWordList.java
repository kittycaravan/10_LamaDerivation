package com.peisia.lamaderivation;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
public class ActivityWordList extends AppCompatActivity {
    private TextView mTvTitle;
    private String mTitle;

    RecyclerView rv;
    private LinearLayoutManager mLlm;
    AdapterWordList adapterWordList;
    ArrayList<ItemWord> mItemsWord = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_list);
        mTvTitle = findViewById(R.id.world_list_tv_title);
        rv = findViewById(R.id.recycler_view_word_list);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null && !TextUtils.isEmpty(bundle.getString("title"))){
            mTitle = bundle.getString("title");
            mTvTitle.setText(mTitle);
        }
        if(TextUtils.equals(mTitle, getString(R.string.main_btn_1))){
            Log.v("hoyangi","==== 단어 데이터 로드 : 최중요 어근");
            loadWordListBestImportantRoot();
        } else if(TextUtils.equals(mTitle, getString(R.string.main_btn_2))){
            Log.v("hoyangi","==== 단어 데이터 로드 : 최중요 접두사");
            loadWordListBestImportantPrefix();
        } else if(TextUtils.equals(mTitle, getString(R.string.main_btn_3))){
            Log.v("hoyangi","==== 단어 데이터 로드 : 접미사");
            loadWordListSuffix();
        } else if(TextUtils.equals(mTitle, getString(R.string.main_btn_4))){
            Log.v("hoyangi","==== 단어 데이터 로드 : 중요 접두사");
            loadWordListImportantPrefix();
        } else if(TextUtils.equals(mTitle, getString(R.string.main_btn_5))){
            Log.v("hoyangi","==== 단어 데이터 로드 : 중요어근");
            loadWordListImportantRoot();
        }
        adapterWordList = new AdapterWordList(mItemsWord);
        rv.setAdapter(adapterWordList);
    }
    /**
     * 1. 최중요 어근
     */
    private void loadWordListBestImportantRoot(){
        mItemsWord.clear(); // 초기화
        mItemsWord.add(new ItemWord("cap", "잡다", "capture", "포획하다"));
        mItemsWord.add(new ItemWord("cap", "머리", "cap", "모자"));
        mItemsWord.add(new ItemWord("cede", "가다", "process", "과정"));
        mItemsWord.add(new ItemWord("duc", "이끌다", "education", "교육"));
        mItemsWord.add(new ItemWord("fac", "만들다", "factory", "공장"));
        mItemsWord.add(new ItemWord("fer", "운반하다", "ferry", "배"));
        mItemsWord.add(new ItemWord("graph", "그리다", "graph", "그래프"));
        mItemsWord.add(new ItemWord("ject", "던지다", "project", "프로젝트"));
        mItemsWord.add(new ItemWord("log", "말", "prologue", "서두"));
        mItemsWord.add(new ItemWord("mit", "보내다", "message", "메시지"));
        mItemsWord.add(new ItemWord("pend", "매달다", "depend", "의존하다"));
        mItemsWord.add(new ItemWord("plic", "접다", "complex", "복잡한"));
        mItemsWord.add(new ItemWord("pos", "놓다", "pose", "자세를 취하다"));
        mItemsWord.add(new ItemWord("press", "누르다", "pressure", "압력"));
        mItemsWord.add(new ItemWord("scrib", "적다", "postscript", "추신"));
        mItemsWord.add(new ItemWord("spec", "보다", "special", "특별한"));
        mItemsWord.add(new ItemWord("spir", "숨 쉬다", "spirit", "정신"));
        mItemsWord.add(new ItemWord("sta", "서다", "stand", "서다"));
        mItemsWord.add(new ItemWord("tain", "잡다", "container", "그릇"));
        mItemsWord.add(new ItemWord("tract", "끌다", "tractor", "견인차"));
        mItemsWord.add(new ItemWord("vis", "보다", "visual", "시각의"));
    }
    /**
     * 2. 최중요 접두사
     */
    private void loadWordListBestImportantPrefix(){
        mItemsWord.clear(); // 초기화
        mItemsWord.add(new ItemWord("pro", "앞에", "protect", "보호하다"));
        mItemsWord.add(new ItemWord("pre", "미리", "preview", "미리보기"));
        mItemsWord.add(new ItemWord("re", "뒤로, 다시", "refill", "다시 채우다"));
        mItemsWord.add(new ItemWord("in", "안에", "input", "입력하다"));
        mItemsWord.add(new ItemWord("ex", "밖으로", "exit", "출구"));
        mItemsWord.add(new ItemWord("out", "밖으로", "outdoor", "야외의"));
        mItemsWord.add(new ItemWord("over", "넘어", "overaction", "과장된 행동"));
        mItemsWord.add(new ItemWord("com", "함께", "combination", "결합"));
        mItemsWord.add(new ItemWord("inter", "사이에", "intersection", "교차로"));
        mItemsWord.add(new ItemWord("trans", "가로질러", "transformer", "변압기"));
        mItemsWord.add(new ItemWord("ad", "~에", "ahead", "앞서, 앞에"));
        mItemsWord.add(new ItemWord("sub", "아래에", "subway", "지하철"));
        mItemsWord.add(new ItemWord("de", "아래로", "degrade", "낮추다"));
        mItemsWord.add(new ItemWord("dis", "아닌", "disrespect", "무례"));
        mItemsWord.add(new ItemWord("un", "아닌", "unhappy", "불행한"));
        mItemsWord.add(new ItemWord("in", "아닌", "incredible", "믿을 수 없는"));
    }
    /**
     * 3. 접미사
     */
    private void loadWordListSuffix(){
        mItemsWord.clear(); // 초기화
        mItemsWord.add(new ItemWord("er", "<명> 행위자", "employer", "고용주"));
        mItemsWord.add(new ItemWord("ee", "<명> 대상자", "employee", "직원"));
        mItemsWord.add(new ItemWord("ist", "<명> 행위자", "artist", "예술가"));
        mItemsWord.add(new ItemWord("ant", "<명> 행위자", "assistant", "보조자"));
        mItemsWord.add(new ItemWord("ary", "<명> 행위자", "secretary", "비서"));
        mItemsWord.add(new ItemWord("ive", "<명> 행위자", "secretary", "비서"));
        mItemsWord.add(new ItemWord("ion", "<명> 행위,성질,상태", "introduction", "소개"));
        mItemsWord.add(new ItemWord("ment", "<명> 행위,성질,상태", "improvement", "개선"));
        mItemsWord.add(new ItemWord("ness", "<명> 행위,성질,상태", "kindness", "친절함"));
        mItemsWord.add(new ItemWord("ance", "<명> 행위,성질,상태", "endurance", "인내"));
        mItemsWord.add(new ItemWord("al", "<명> 행위,성질,상태", "proposal", "제안"));
        mItemsWord.add(new ItemWord("ure", "<명> 행위,성질,상태", "proposal", "제안"));
        mItemsWord.add(new ItemWord("th", "<명> 행위,성질,상태", "strength", "힘"));
        mItemsWord.add(new ItemWord("cy", "<명> 행위,성질,상태", "accuracy", "정확성"));
        mItemsWord.add(new ItemWord("ty", "<명> 행위,성질,상태", "accuracy", "정확성"));
        mItemsWord.add(new ItemWord("ry", "<명> 행위,업종,종류", "machinery", "기계류"));
        mItemsWord.add(new ItemWord("ory", "<명> 장소", "laboratory", "연구실"));
        mItemsWord.add(new ItemWord("ics", "<명> 학문", "economics", "경제학"));
        mItemsWord.add(new ItemWord("ship", "<명> 자격, 특성", "membership", "회원 자격"));
        mItemsWord.add(new ItemWord("ism", "<명> 주의, 특성", "optimism", "낙관주의"));
        mItemsWord.add(new ItemWord("hood", "<명>시대[시기],관계", "childhood", "어린 시절"));
        mItemsWord.add(new ItemWord("ize", "<동>~이 되게 하다", "memorize", "암기하다"));
        mItemsWord.add(new ItemWord("ate", "<동>~하게 하다", "motivate", "동기를 부여하다"));
        mItemsWord.add(new ItemWord("ify", "<동>~하게 하다", "simplify", "단순하게 하다"));
        mItemsWord.add(new ItemWord("en", "<동>~하게 하다", "strengthen", "강화하다"));
        mItemsWord.add(new ItemWord("able", "<형>가능성", "available", "이용할 수 있는"));
        mItemsWord.add(new ItemWord("ful", "<형>풍부", "meaningful", "의미 있는"));
        mItemsWord.add(new ItemWord("less", "<형>결핍", "careless", "부주의한"));
        mItemsWord.add(new ItemWord("ern", "<형>방향", "eastern", "동쪽의"));
        mItemsWord.add(new ItemWord("ic", "<형>성질,성향", "basic", "기본적인"));
        mItemsWord.add(new ItemWord("ous", "<형>성질,성향", "basic", "기본적인"));
        mItemsWord.add(new ItemWord("ar", "<형>성질,성향", "familiar", "친근한"));
        mItemsWord.add(new ItemWord("al", "<형>성질,성향", "familiar", "친근한"));
        mItemsWord.add(new ItemWord("ate", "<형>성질,성향", "passionate", "열정적인"));
        mItemsWord.add(new ItemWord("ant", "<형>성질,성향", "passionate", "열정적인"));
        mItemsWord.add(new ItemWord("ly", "<형>성질,성향", "lovely", "사랑스러운"));
        mItemsWord.add(new ItemWord("y", "<형>성질,성향", "lovely", "사랑스러운"));
        mItemsWord.add(new ItemWord("ish", "<형>성질,성향", "childish", "아이 같은"));
        mItemsWord.add(new ItemWord("ive", "<형>성질,성향", "childish", "아이 같은"));
        mItemsWord.add(new ItemWord("ly", "<부>방식", "fluently", "유창하게"));
        mItemsWord.add(new ItemWord("ward", "<부>방향", "eastward", "동쪽으로"));
        mItemsWord.add(new ItemWord("way", "<부>방법,방향,정도", "anyway", "어쨌든"));
    }
    /**
     * 4. 중요 접두사
     */
    private void loadWordListImportantPrefix(){
        mItemsWord.clear(); // 초기화
        mItemsWord.add(new ItemWord("fore", "미리", "foresee", "예견하다"));
        mItemsWord.add(new ItemWord("ante", "앞에", "ancestor", "조상"));
        mItemsWord.add(new ItemWord("post", "뒤에", "postpone", "연기하다"));
        mItemsWord.add(new ItemWord("up", "위로", "uphold", "지지하다"));
        mItemsWord.add(new ItemWord("under", "아래에", "undergo", "겪다"));
        mItemsWord.add(new ItemWord("by", "부차적인", "by-product", "부산물"));
        mItemsWord.add(new ItemWord("extra", "밖에", "extraordinary", "비범한"));
        mItemsWord.add(new ItemWord("non", "없는", "nonfiction", "논픽션, 실화"));
        mItemsWord.add(new ItemWord("anti", "대항하여", "antiaging", "노화 방지의"));
        mItemsWord.add(new ItemWord("counter", "대항하여", "contrary", "반대의"));
        mItemsWord.add(new ItemWord("with", "떨어져", "withdraw", "철수하다"));
        mItemsWord.add(new ItemWord("mal", "나쁜", "malice", "악의"));
        mItemsWord.add(new ItemWord("mis", "잘못된", "mistake", "실수"));
        mItemsWord.add(new ItemWord("bio", "생명", "biology", "생물학"));
        mItemsWord.add(new ItemWord("dia", "가로질러", "dialect", "방언"));
        mItemsWord.add(new ItemWord("eco", "환경", "ecosystem", "생태계"));
        mItemsWord.add(new ItemWord("geo", "땅", "geometry", "기하학"));
        mItemsWord.add(new ItemWord("micro", "작은", "microscope", "현미경"));
        mItemsWord.add(new ItemWord("tele", "멀리 있는", "telepathy", "텔레파시"));
        mItemsWord.add(new ItemWord("auto", "스스로", "automatic", "자동의"));
        mItemsWord.add(new ItemWord("ob", "~에 맞서", "obvious", "명백한"));
        mItemsWord.add(new ItemWord("ab", "떨어져", "abnormal", "비정상적인"));
        mItemsWord.add(new ItemWord("se", "떨어져", "separate", "분리하다"));
        mItemsWord.add(new ItemWord("syn", "함께", "synthesis", "종합"));
        mItemsWord.add(new ItemWord("bene", "좋은", "benefit", "혜택"));
        mItemsWord.add(new ItemWord("super", "위에", "superb", "최고의"));
        mItemsWord.add(new ItemWord("per", "완전히", "perfect", "완벽한"));
        mItemsWord.add(new ItemWord("en", "하게 만들다", "enable", "가능하게 하다"));
        mItemsWord.add(new ItemWord("a", "아주, 아닌", "alike", "비슷한"));
        mItemsWord.add(new ItemWord("mono", "하나", "monorail", "모노레일"));
        mItemsWord.add(new ItemWord("uni", "하나", "uniform", "유니폼"));
        mItemsWord.add(new ItemWord("bi", "둘", "bicyclee", "자전거"));
        mItemsWord.add(new ItemWord("du", "둘", "bicyclee", "자전거"));
        mItemsWord.add(new ItemWord("twi", "둘", "bicyclee", "자전거"));
        mItemsWord.add(new ItemWord("tri", "셋", "triangle", "삼각형"));
        mItemsWord.add(new ItemWord("multi", "다수의", "multimedia", "멀티미디어"));
    }
    /**
     * 5. 중요어근
     */
    private void loadWordListImportantRoot(){
        mItemsWord.clear(); // 초기화
        mItemsWord.add(new ItemWord("act", "행동하다", "react", "반응하다"));
        mItemsWord.add(new ItemWord("alter", "다른", "alter", "바꾸다"));
        mItemsWord.add(new ItemWord("ama", "사랑", "amateur", "아마추어"));
        mItemsWord.add(new ItemWord("ann", "해마다", "annual", "매년의"));
        mItemsWord.add(new ItemWord("apt", "맞추다", "apt", "적절한"));
        mItemsWord.add(new ItemWord("arm", "무기", "army", "군대"));
        mItemsWord.add(new ItemWord("art", "예술", "artwork", "예술품"));
        mItemsWord.add(new ItemWord("astro", "별", "astronomy", "천문학"));
        mItemsWord.add(new ItemWord("audi", "듣다", "audience", "관객"));
        mItemsWord.add(new ItemWord("bar", "막대", "bar", "막대, 장벽"));
        mItemsWord.add(new ItemWord("base", "기초", "base", "맨 아래 부분"));
        mItemsWord.add(new ItemWord("bat", "치다", "bat", "(야구) 방망이"));
        mItemsWord.add(new ItemWord("board", "나무판자", "board", "판자, 게시판"));
        mItemsWord.add(new ItemWord("break", "깨다", "break", "깨다, 부수다"));
        mItemsWord.add(new ItemWord("camp", "들판", "campaign", "캠페인"));
        mItemsWord.add(new ItemWord("can", "관", "cane", "줄기"));
        mItemsWord.add(new ItemWord("car", "마차", "carry", "나르다"));
        mItemsWord.add(new ItemWord("cast", "던지다", "cast", "던지다, 드리우다"));
        mItemsWord.add(new ItemWord("centr", "중심", "central", "중심의"));
        mItemsWord.add(new ItemWord("cern", "거르다", "concern", "우려"));
        mItemsWord.add(new ItemWord("cert", "확실한", "certain", "확실한"));
        mItemsWord.add(new ItemWord("cid", "떨어지다", "accident", "사고"));
        mItemsWord.add(new ItemWord("cide", "죽이다", "suicide", "자살"));
        mItemsWord.add(new ItemWord("circul", "원", "circular", "원형의"));
        mItemsWord.add(new ItemWord("cite", "부르다", "cite", "인용하다"));
        mItemsWord.add(new ItemWord("civi", "시", "civic", "도시의"));
        mItemsWord.add(new ItemWord("claim", "외치다", "claim", "주장하다"));
        mItemsWord.add(new ItemWord("clin", "기울이다", "decline", "감소하다"));
        mItemsWord.add(new ItemWord("clos", "닫다", "close", "닫다, 끝나다"));
        mItemsWord.add(new ItemWord("cogn", "알다", "cognitive", "인식의"));
        mItemsWord.add(new ItemWord("commun", "공통의", "community", "사회, 공동체"));
        mItemsWord.add(new ItemWord("cord", "심장", "cordial", "화기애애한"));
        mItemsWord.add(new ItemWord("corpor", "몸", "corporate", "기업의"));
        mItemsWord.add(new ItemWord("count", "계산하다", "discount", "할인"));
        mItemsWord.add(new ItemWord("cover", "덮다", "cover", "덮다, 다루다"));
        mItemsWord.add(new ItemWord("crea", "만들다", "create", "창조하다"));
        mItemsWord.add(new ItemWord("cred", "믿다", "credit", "신용"));
        mItemsWord.add(new ItemWord("cult", "경작하다", "cultivate", "기르다"));
        mItemsWord.add(new ItemWord("cur", "달리다", "current", "현재의"));
        mItemsWord.add(new ItemWord("dam", "손실", "damage", "손상"));
        mItemsWord.add(new ItemWord("dem", "사람들", "democracy", "민주주의"));
        mItemsWord.add(new ItemWord("dict", "말하다", "dictation", "받아쓰기"));
        mItemsWord.add(new ItemWord("doc", "가르치다", "doctor", "의사, 박사"));
        mItemsWord.add(new ItemWord("don", "주다", "donate", "기부하다"));
        mItemsWord.add(new ItemWord("equ", "같은", "equal", "같은"));
        mItemsWord.add(new ItemWord("ess", "존재하다", "essence", "본질"));
        mItemsWord.add(new ItemWord("estim", "평가하다", "esteem", "존경하다"));
        mItemsWord.add(new ItemWord("fa", "말하다", "fable", "우화"));
        mItemsWord.add(new ItemWord("fall", "속이다", "fallacy", "오류"));
        mItemsWord.add(new ItemWord("fare", "가다", "fare", "(교통) 요금"));
        mItemsWord.add(new ItemWord("fend", "때리다", "defend", "방어하다"));
        mItemsWord.add(new ItemWord("fest", "기쁨", "festival", "축제"));
        mItemsWord.add(new ItemWord("fid", "믿다", "confident", "자신감 있는"));
        mItemsWord.add(new ItemWord("fil", "실", "file", "파일"));
        mItemsWord.add(new ItemWord("fin", "끝내다", "final", "마지막의"));
        mItemsWord.add(new ItemWord("firm", "확실한", "firm", "회사"));
        mItemsWord.add(new ItemWord("flect", "구부리다", "reflect", "비추다"));
        mItemsWord.add(new ItemWord("flict", "치다", "conflict", "갈등"));
        mItemsWord.add(new ItemWord("flu", "흐르다", "fluent", "유창한"));
        mItemsWord.add(new ItemWord("form", "형태", "form", "형태, 유형"));
        mItemsWord.add(new ItemWord("fort", "힘", "effort", "노력"));
        mItemsWord.add(new ItemWord("frag", "깨다", "fragile", "부서지기 쉬운"));
        mItemsWord.add(new ItemWord("fund", "기반", "fund", "자금"));
        mItemsWord.add(new ItemWord("fuse", "녹이다", "confuse", "혼동하다"));
        mItemsWord.add(new ItemWord("gar", "덮다", "garment", "의복"));
        mItemsWord.add(new ItemWord("gard", "지켜보다", "regard", "여기다"));
        mItemsWord.add(new ItemWord("gener", "태생", "generate", "발생시키다"));
        mItemsWord.add(new ItemWord("gest", "운반하다", "digest", "소화되다"));
        mItemsWord.add(new ItemWord("grad", "단계", "grade", "등급, 성적"));
        mItemsWord.add(new ItemWord("grat", "기쁨", "gratitude", "감사"));
        mItemsWord.add(new ItemWord("grav", "무거운", "grave", "무덤"));
        mItemsWord.add(new ItemWord("hab", "가지다", "habit", "습관"));
        mItemsWord.add(new ItemWord("hand", "손", "handy", "편리한"));
        mItemsWord.add(new ItemWord("hap", "운", "happy", "행복한"));
        mItemsWord.add(new ItemWord("heal", "완전한", "health", "건강"));
        mItemsWord.add(new ItemWord("hered", "상속인", "heredity", "유전"));
        mItemsWord.add(new ItemWord("horr", "떨다", "horror", "공포"));
        mItemsWord.add(new ItemWord("host", "손님", "hostel", "호스텔"));
        mItemsWord.add(new ItemWord("hum", "땅", "humble", "겸손한"));
        mItemsWord.add(new ItemWord("ide", "보다", "idea", "생각"));
        mItemsWord.add(new ItemWord("insula", "섬", "peninsula", "반도"));
        mItemsWord.add(new ItemWord("it", "가다", "exit", "출구"));
        mItemsWord.add(new ItemWord("journ", "하루", "journey", "여행"));
        mItemsWord.add(new ItemWord("junct", "연결하다", "juncture", "연결점"));
        mItemsWord.add(new ItemWord("just", "올바른", "just", "정확히, 딱"));
        mItemsWord.add(new ItemWord("kin", "태어남", "kind", "종류"));
        mItemsWord.add(new ItemWord("labor", "일", "labor", "노동"));
        mItemsWord.add(new ItemWord("lav", "씻다", "laundry", "세탁"));
        mItemsWord.add(new ItemWord("lax", "느슨하게 하다", "relax", "쉬다"));
        mItemsWord.add(new ItemWord("lect", "모으다", "collect", "모으다"));
        mItemsWord.add(new ItemWord("leg", "법", "legal", "법적인"));
        mItemsWord.add(new ItemWord("lev", "올리다", "elevator", "승강기"));
        mItemsWord.add(new ItemWord("liber", "자유", "liberal", "자유로운"));
        mItemsWord.add(new ItemWord("lic", "꾀다", "delicous", "맛있는"));
        mItemsWord.add(new ItemWord("lig", "묶다", "oblige", "강요하다"));
        mItemsWord.add(new ItemWord("limin", "경계", "limit", "제한"));
        mItemsWord.add(new ItemWord("lin", "선", "line", "선, 라인"));
        mItemsWord.add(new ItemWord("lingu", "혀", "language", "언어"));
        mItemsWord.add(new ItemWord("liter", "글자", "literature", "문학"));
        mItemsWord.add(new ItemWord("loc", "장소", "local", "지역의"));
        mItemsWord.add(new ItemWord("long", "긴", "long", "긴, 오랜"));
        mItemsWord.add(new ItemWord("lud", "놀다", "illusion", "환상"));
        mItemsWord.add(new ItemWord("lumin", "빛", "illuminate", "(빛을) 비추다"));
        mItemsWord.add(new ItemWord("mag", "엄청난", "magnify", "확대하다"));
        mItemsWord.add(new ItemWord("mand", "명령하다", "demand", "요구하다"));
        mItemsWord.add(new ItemWord("manu", "손", "manual", "안내 책자"));
        mItemsWord.add(new ItemWord("mater", "어머니", "matter", "문제"));
        mItemsWord.add(new ItemWord("mechan", "기계", "mechanic", "정비사"));
        mItemsWord.add(new ItemWord("medi", "중간", "medium", "중간의"));
        mItemsWord.add(new ItemWord("medic", "병을 고치다", "medical", "의료의"));
        mItemsWord.add(new ItemWord("memor", "마음에 새기는", "memory", "기억"));
        mItemsWord.add(new ItemWord("ment", "마음", "mental", "정신의"));
        mItemsWord.add(new ItemWord("merc", "거래하다", "merchant", "상인"));
        mItemsWord.add(new ItemWord("merg", "빠지다", "emerge", "나타나다"));
        mItemsWord.add(new ItemWord("meter", "재다", "diameter", "지름"));
        mItemsWord.add(new ItemWord("migr", "이동하다", "migrate", "이동하다"));
        mItemsWord.add(new ItemWord("min", "작은", "minor", "소수의"));
        mItemsWord.add(new ItemWord("mir", "놀라다", "miracle", "기적"));
        mItemsWord.add(new ItemWord("mod", "척도", "moderate", "온건한"));
        mItemsWord.add(new ItemWord("mort", "죽음", "mortal", "죽음을 면할 수 없는"));
        mItemsWord.add(new ItemWord("mot", "움직이다", "motive", "동기"));
        mItemsWord.add(new ItemWord("mount", "오르다", "mount", "올라가다"));
        mItemsWord.add(new ItemWord("mut", "바꾸다", "commute", "통근하다"));
        mItemsWord.add(new ItemWord("nat", "태어난", "nation", "국가, 국민"));
        mItemsWord.add(new ItemWord("nav", "배", "navigate", "항해하다"));
        mItemsWord.add(new ItemWord("neg", "아닌", "negative", "부정적인"));
        mItemsWord.add(new ItemWord("nerv", "신경", "nervous", "긴장되는"));
        mItemsWord.add(new ItemWord("nom", "이름", "nominate", "지명하다"));
        mItemsWord.add(new ItemWord("norm", "규범", "normal", "정상의"));
        mItemsWord.add(new ItemWord("nounc", "알리다", "announce", "발표하다"));
        mItemsWord.add(new ItemWord("nov", "새로운", "novel", "소설"));
        mItemsWord.add(new ItemWord("numer", "숫자", "numerous", "수많은"));
        mItemsWord.add(new ItemWord("nutr", "양분을 주다", "nutrient", "영양분"));
        mItemsWord.add(new ItemWord("oper", "일", "operate", "운영하다"));
        mItemsWord.add(new ItemWord("opt", "보다", "optic", "눈의"));
        mItemsWord.add(new ItemWord("ordin", "순서", "ordinary", "보통의"));
        mItemsWord.add(new ItemWord("organ", "기관", "organ", "장기, 기관"));
        mItemsWord.add(new ItemWord("ori", "일어나다", "origin", "기원"));
        mItemsWord.add(new ItemWord("pan", "빵", "company", "회사"));
        mItemsWord.add(new ItemWord("par", "동등한", "compare", "비교하다"));
        mItemsWord.add(new ItemWord("para", "옆에", "parallel", "평행인"));
        mItemsWord.add(new ItemWord("part", "부분", "aprt", "부분, 일부"));
        mItemsWord.add(new ItemWord("pass", "통과하다", "passenger", "승객"));
        mItemsWord.add(new ItemWord("path", "느끼다", "sympathy", "동정"));
        mItemsWord.add(new ItemWord("patr", "아버지", "patriot", "애국자"));
        mItemsWord.add(new ItemWord("ped", "발", "pedal", "페달"));
        mItemsWord.add(new ItemWord("pel", "끌어내다", "compel", "강요하다"));
        mItemsWord.add(new ItemWord("pen", "벌", "penalty", "처벌"));
        mItemsWord.add(new ItemWord("per", "시도하다", "experience", "경험"));
        mItemsWord.add(new ItemWord("pet", "추구하다", "compete", "경쟁하다"));
        mItemsWord.add(new ItemWord("phas", "보여주다", "emphasize", "강조하다"));
        mItemsWord.add(new ItemWord("phon", "소리", "microphone", "마이크"));
        mItemsWord.add(new ItemWord("ple", "채우다", "complete", "완료하다"));
        mItemsWord.add(new ItemWord("plore", "소리치다", "explore", "탐험하다"));
        mItemsWord.add(new ItemWord("point", "지점", "appoint", "임명하다"));
        mItemsWord.add(new ItemWord("polis", "도시", "police", "경찰"));
        mItemsWord.add(new ItemWord("popul", "사람들", "popular", "인기 있는"));
        mItemsWord.add(new ItemWord("port", "운반하다", "portable", "휴대가 쉬운"));
        mItemsWord.add(new ItemWord("pot", "힘", "potential", "가능성이 있는"));
        mItemsWord.add(new ItemWord("prehend", "잡다", "comprehend", "이해하다"));
        mItemsWord.add(new ItemWord("prim", "첫번째의", "prime", "주요한"));
        mItemsWord.add(new ItemWord("priv", "떼어놓다", "private", "사적인"));
        mItemsWord.add(new ItemWord("prob", "증명하다", "probe", "탐사하다"));
        mItemsWord.add(new ItemWord("put", "생각하다", "computer", "컴퓨터"));
        mItemsWord.add(new ItemWord("quir", "구하다", "acquire", "획득하다"));
        mItemsWord.add(new ItemWord("rad", "광선", "radio", "라디오"));
        mItemsWord.add(new ItemWord("rang", "줄", "range", "범위"));
        mItemsWord.add(new ItemWord("rect", "똑바로 하다", "correct", "맞는"));
        mItemsWord.add(new ItemWord("rot", "바퀴", "rotate", "회전하다"));
        mItemsWord.add(new ItemWord("rupt", "깨다", "bankrupt", "파산한"));
        mItemsWord.add(new ItemWord("scend", "오르다", "ascend", "오르다"));
        mItemsWord.add(new ItemWord("sci", "알다", "science", "과학"));
        mItemsWord.add(new ItemWord("sect", "자르다", "section", "조각"));
        mItemsWord.add(new ItemWord("sens", "느끼다", "sense", "감각"));
        mItemsWord.add(new ItemWord("sequ", "따라가다", "sequence", "순서"));
        mItemsWord.add(new ItemWord("serv", "지키다", "conserve", "아끼다"));
        mItemsWord.add(new ItemWord("sid", "앉다", "president", "회장"));
        mItemsWord.add(new ItemWord("sign", "표시", "sign", "표시, 신호"));
        mItemsWord.add(new ItemWord("simil", "비슷한", "similar", "비슷한"));
        mItemsWord.add(new ItemWord("soci", "동료", "society", "사회"));
        mItemsWord.add(new ItemWord("solv", "느슨하게 하다", "solve", "해결하다"));
        mItemsWord.add(new ItemWord("soph", "현명한", "philosophy", "철학"));
        mItemsWord.add(new ItemWord("spon", "약속하다", "sponsor", "후원자"));
        mItemsWord.add(new ItemWord("stick", "찌르다", "sticker", "스티커"));
        mItemsWord.add(new ItemWord("strict", "팽팽하게 당기다", "strict", "염격한"));
        mItemsWord.add(new ItemWord("struct", "세우다", "structure", "구조"));
        mItemsWord.add(new ItemWord("sult", "뛰어오르다", "insult", "모욕하다"));
        mItemsWord.add(new ItemWord("sum", "취하다", "assume", "추정하다"));
        mItemsWord.add(new ItemWord("tact", "손대다", "contact", "연락"));
        mItemsWord.add(new ItemWord("techn", "기술", "technique", "기법"));
        mItemsWord.add(new ItemWord("tect", "덮다", "protect", "보호하다"));
        mItemsWord.add(new ItemWord("temper", "섞다", "temper", "기질"));
        mItemsWord.add(new ItemWord("tempt", "시험하다", "temptation", "유혹"));
        mItemsWord.add(new ItemWord("tend", "뻗다", "extend", "연장하다"));
        mItemsWord.add(new ItemWord("term", "경계", "terminal", "터미널"));
        mItemsWord.add(new ItemWord("terr", "대지", "terrace", "테라스"));
        mItemsWord.add(new ItemWord("test", "증언하다", "contest", "대회"));
        mItemsWord.add(new ItemWord("text", "천을 짜다", "text", "본문"));
        mItemsWord.add(new ItemWord("tom", "자르다", "atom", "원자"));
        mItemsWord.add(new ItemWord("ton", "소리", "tone", "어조"));
        mItemsWord.add(new ItemWord("tort", "비틀다", "torture", "고문"));
        mItemsWord.add(new ItemWord("tribut", "할당하다", "contribute", "기부하다"));
        mItemsWord.add(new ItemWord("tru", "단단한", "trust", "신뢰"));
        mItemsWord.add(new ItemWord("tum", "부풀어 오르다", "tumor", "종양"));
        mItemsWord.add(new ItemWord("turb", "어지럽히다", "disturb", "방해하다"));
        mItemsWord.add(new ItemWord("us", "사용하다", "use", "사용하다"));
        mItemsWord.add(new ItemWord("vac", "비어 있는", "vacuum", "진공"));
        mItemsWord.add(new ItemWord("vad", "가다", "invade", "침입하다"));
        mItemsWord.add(new ItemWord("val", "가치 있는", "value", "가치"));
        mItemsWord.add(new ItemWord("vent", "오다", "adventure", "모험"));
        mItemsWord.add(new ItemWord("vert", "돌리다", "convert", "전환시키다"));
        mItemsWord.add(new ItemWord("vest", "옷", "vest", "조끼"));
        mItemsWord.add(new ItemWord("via", "길", "convey", "나르다"));
        mItemsWord.add(new ItemWord("vict", "이기다", "victory", "승리"));
        mItemsWord.add(new ItemWord("viv", "살다", "survive", "살아남다"));
        mItemsWord.add(new ItemWord("voc", "부르다", "voice", "목소리"));
        mItemsWord.add(new ItemWord("volv", "말다", "involve", "포함하다"));
        mItemsWord.add(new ItemWord("vot", "서약하다", "vote", "투표"));
        mItemsWord.add(new ItemWord("war", "주의하다", "warn", "경고하다"));
    }
}
