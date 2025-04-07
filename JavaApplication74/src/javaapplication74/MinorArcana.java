/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication74;


public class MinorArcana extends Kart {
    
        private static final String[] minorKartlar={ "Asa Asi","Asa Ikilisi","Asa Uclusu","Asa Dortlusu","Asa Beslisi","Asa Altilisi","Asa Yedilisi","Asa Sekizlisi","Asa Dokuzlusu","Asa Onlusu","Asa Prensi","Asa Sovalyesi","Asa Kralicesi","Asa Krali",
        "Kupa Asi","Kupa Ikilisi","Kupa Uclusu","Kupa Dortlusu","Kupa Beslisi","Kupa Altilisi","Kupa Yedilisi","Kupa Sekizlisi","Kupa Dokuzlusu","Kupa Onlusu","Kupa Prensi","Asa Sovalyesi","Kupa Kralicesi","Kupa Krali",
        "Kilic Asi","Kilic Ikilisi","Kilic Uclusu","Kilic Dortlusu","Kilic Beslisi","Kilic Altilisi","Kilic Yedilisi","Kilic Sekizlisi","Kilic Dokuzlusu","Kilic Onlusu","Asa Prensi","Kilic SOvalyesi","Kilic Kralicesi","Kilic Krali",
        "Degnek Asi","Degnek Ikilisi","Degnek Uclusu","Degnek Dortlusu","Degnek Beslisi","Degnek Altilisi","Degnek Yedilisi","Degnek Sekizlisi","Degnek Dokuzlusu","Degnek Onlusu","Degnek Prensi","Degnek SOvalyesi","Degnek Kralicesi","Degnek Krali",
    };
    public MinorArcana(){
        System.out.println("Minor Kart cekildi ");
    }
      @Override
    public String getAnlamlar(int tercih, int KartNumara) {
        return kAnlamlar[tercih][KartNumara];
        }

    @Override
    public String getKart(int numara) {
        return minorKartlar[numara];
    }
     private static String[][] kAnlamlar={
             //22(Asa Ası)
    {
        "Bu kart, maddi dunyada yeni bir baslangıc ve firsatlari simgeler. \n"
        + "Maddi anlamda size sunulan yeni bir yol, kariyer ya da gelir firsatlari \n"
        + "hayatiniza girebilir. Bu, somut anlamda buyume ve gelisme surecinizin \n"
        + "basladıgını gosterir. Yeni projelere baslamak, finansal durumunuzu \n"
        + "guclendirecek saglam adimlar atmak icin uygun bir donemdesiniz.",
        
        "Ask hayatinizda yeni bir baslangic ya da saglam bir iliski kurma \n"
        + "zamanı olabilir. İliskilerde guven, sadakat ve saglam bir temele dayanma \n"
        + "arayısında olabilirsiniz. Bu kart, kalici ve guclu bir iliski kurmak için \n"
        + "dogru zamanin geldigini gosterir. Bekarlar icin, hayatınıza girecek yeni \n"
        + "bir kişiyle duygusal ve maddi açıdan güvenli bir ilişkiye adım atmanız \n"
        + "olasılıklar dahilindedir.",
        
        "Is hayatinda yeni bir is ya da projeye baslamak icin mukemmel \n"
        + "bir zamandir. Bu kart, maddi anlamda buyume ve kariyerinize yatirim \n"
        + "yapma firsati sunar. Yeni bir is firsati, buyuk bir basari ya da finansal \n"
        + "bir kazanc sizin icin ufukta olabilir."
    },
    
    //23(Asa İkilisi)
    {
        "Bu kart, hayatinizdaki dengeyi bulma ve maddi ve manevi dunyalar \n"
        + "arasinda denge kurma zamani oldugunu isaret eder. Birden fazla is veya \n"
        + "sorumluluk arasinda denge kurarak, her iki alani da basarili bir sekilde \n"
        + "yonetebilirsiniz. Kararsizlik donemi geciyor, artik sorumluluklarinizi daha \n"
        + "rahat ve dengeli bir sekilde yonetebileceksiniz.",
        
        "Iliskinizde denge kurma zamani. Hem maddi hem duygusal ihtiyaclarinizi \n"
        + "birbirine entegre ederek, saglıklı bir iliski kurabilirsiniz. Bu donemde \n"
        + "partnerinizle birlikte kaynaklarinizi paylasarak daha saglam temeller uzerinde \n"
        + "bir iliski insa edebilirsiniz. Bekarlar icin, kisisel ihtiyaclarinizi ve \n"
        + "duygusal gereksinimlerinizi dengeleyerek, uyumlu bir iliski kurma firsatiniz var.",
        
        "Is hayatinda birden fazla projeyi ya da sorumlulugu dengelemek gerekecek. \n"
        + "Bu kart, islerinizi ve gunluk sorumluluklarinizi dengeli bir sekilde yurutmeniz \n"
        + "gerektigini gosterir. Cesitli gorevleri ve firsatlari bir arada tutarak \n"
        + "basarıya ulasabilirsiniz."
    },
    
    //24(Asa Üçlüsü)
    {
        "Bu kart, takım calismasi, isbirligi ve birlikte calisma gerekliligini \n"
        + "simgeler. Basari, tek basina degil, birlikte hareket ettiginiz kisilerle \n"
        + "elde edilecektir. Bu donemde, el birligiyle yapilan calismalarin meyvelerini \n"
        + "toplayacaksiniz ve baskalarinin katkilariyla daha buyuk bir basari \n"
        + "elde edebilirsiniz.",
        
        "İliskilerde isbirligi ve birlikte hareket etme zamani. Partnerinizle \n"
        + "birlikte ortak bir hedefe ulasma arzusunda olabilirsiniz. Bu kart, \n"
        + "iliskinizde daha fazla uyum ve isbirligi kurmanizi saglayacak bir \n"
        + "donem oldugunu gosterir. Bekarlar icin, baskalarindan yardim ve destek \n"
        + "alarak yeni bir iliskiye adim atma firsati dogabilir.",
        
        "Is hayatinda basari, takim calismasina dayali olacaktir. Ortak \n"
        + "projelerde ve grup calismalarinda ustun basari elde edebilirsiniz. \n"
        + "Bu kart, is arkadaslarinizla uyum icinde calısarak, buyuk bir \n"
        + "basariya ulasmaniza isaret eder."
    },
    
    //25(Asa Dörtlüsü)
    {
        "Bu kart, maddi guven ve korunma arayisini simgeler. Hayatinizdaki \n"
        + "varliklarinizi korumaya calisirken, duygusal ya da maddi kayiplar \n"
        + "yasama korkusu da olabilir. Bu donemde, varliklariniza sahip cikarken, \n"
        + "asiriya kacmamaya ozen gostermelisiniz. Kendi guvenliginizi ve \n"
        + "istikrarinizi saglamaya odaklanabilirsiniz.",
        
        "İliskilerde guvenli ve saglam temeller arayisinda olabilirsiniz. \n"
        + "Partnerinizle birlikte ortak bir gelecege yatirim yapmak isteyebilirsiniz. \n"
        + "Iliskilerde istikrar ve guven arayisiniz on planda olacaktir. Bekarlar icin, \n"
        + "kendi guvenliginizi saglama, duygusal olarak hazir hissetme \n"
        + "sureci devam ediyor.",
        
        "Is hayatinda, guvenli bir finansal temel olusturmak isteyebilirsiniz. \n"
        + "Mevcut isinizi korumak ve kazanclarinizi artirmak icin cesitli adimlar \n"
        + "atabilirsiniz. Bu kart, gelecekteki maddi guvenliginizi saglamak \n"
        + "icin istikrarlı bir yol secmenizi onerir."
    },
    
    //26(Asa Beşlisi)
    {
        "Bu kart, maddi kayiplar, zorluklar ve sikintilarla ilgili bir \n"
        + "donemi isaret eder. Yasadiginiz finansal ya da maddi krizler, duygusal \n"
        + "olarak da zorlayici olabilir. Ancak bu durum, daha iyi bir gelecege \n"
        + "ulasmak icin size degerli dersler sunacak ve yeniden ayaga \n"
        + "kalkmanizi saglayacaktir.",
        
        "Iliskide maddi ya da duygusal zorluklarla karsilasabilirsiniz. \n"
        + "Partnerinizle birlikte bu zorluklarin ustesinden gelmeniz gerekebilir. \n"
        + "Zor donemlerin ardindan iliskinizde daha guclu bir bag kurabilirsiniz. \n"
        + "Bekarlar icin, gecmisteki maddi ya da duygusal zorluklarin etkisini \n"
        + "asmak ve yeni bir baslangic yapmak zaman alabilir.",
        
        "Is hayatinda finansal zorluklar ya da kayiplar yasanabilir. \n"
        + "Ancak bu durum, gelecekte daha saglam bir maddi temele ulasmak icin \n"
        + "gecici bir donemin parcasidir. Yatirim yaparken dikkatli olmali ve \n"
        + "uzun vadeli planlar yaparak mali guvenliginizi saglamaya calismalisiniz."
    },
    
    //27(Asa Altılısı)
    {
        "Bu kart, comertlik ve karsıiikli yardimlasma donemini isaret \n"
        + "eder. Maddi ya da duygusal olarak yardim alabilir veya başskalarina \n"
        + "yardim edebilirsiniz. Bu surec, karsilikli fayda saglayan iliskiler \n"
        + "ve yardimlasmanin on planda oldugu bir donemi simgeler.",
        
        "Iliskilerde karsilikli fayda, paylasim ve comertlik on planda \n"
        + "olacaktir. Partnerinizle birbirinize destek olabilir ve iliskinizdeki \n"
        + "dengeyi saglam tutabilirsiniz. Bekarlar icin, baskalarindan alacaginiz \n"
        + "destek ile yeni bir iliskiye adim atmaniz olasidir.",
        
        "Is hayatinda, baskalarina yardim etmek ya da yardim almak \n"
        + "basarili olmanizi saglayacaktir. Bir is arkadasinizdan ya da patronunuzdan \n"
        + "alacaginiz destek, sizi hedeflerinize daha kolay ulastirabilir. \n"
        + "Ayni zamanda comert davranarak, cevrenizdeki insanlarla guclu \n"
        + "iliskiler kurabilirsiniz."
    },
    //28(Asa Yedilisi)
    {
        "Bu kart, sabir, uzun vadeli cabalar ve emeginizin karsiligini \n"
        + "alma zamani oldugunu simgeler. Bu donemde, basladiginiz isleri bitirmeniz \n"
        + "icin sabirli olmaniz gerekebilir. Maddi kazanc ve basarilar, zaman alabilir, \n"
        + "ancak cabalarinizin karsiligini alacaginiz bir donemdesiniz.",
        
        "Iliskilerde, sabirli olmaniz ve partnerinizle birlikte uzun vadeli \n"
        + "hedeflere ulasmak icin caba gostermeniz gerekebilir. Bu kart, \n"
        + "iliskinizdeki gelisim surecinin zaman alacagini, ancak sabirli ve \n"
        + "kararli oldugunuzda kalici bir basariya ulasacağinizi isaret eder.",
        
        "Is hayatinda, uzun vadeli hedefleriniz icin sabirli ve kararli \n"
        + "bir sekilde calismalisiniz. Basari, cabalarinizin karsiligini almak \n"
        + "icin zaman alabilir, ancak dogru yonu sectiginizde maddi ve \n"
        + "kariyersel anlamda kazanc saglarsiniz."
    },
    
    //29(Asa Sekizlisi)
    {
        "Bu kart, dikkatli ve ozverili calismanin simgesidir. Bugun \n"
        + "attiginiz her adim, gelecekteki basarilarinizin temelini olusturacaktir. \n"
        + "Emek ve dikkat gerektiren islerde basarili olabilirsiniz. Bu donem, \n"
        + "bir seylere odaklanarak derinlemesine calismak ve gelisim saglamak \n"
        + "icin idealdir.",
        
        "Iliskinizde daha fazla caba ve dikkat gostermeniz gereken bir \n"
        + "donemdesiniz. Partnerinize karsi olan sorumluluklarinizi yerine \n"
        + "getirerek, iliskinizin saglam temeller uzerine insa edilmesine \n"
        + "yardimci olabilirsiniz. Bekarlar icin, aski bulmak icin caba gostermeniz \n"
        + "gerekebilir, ancak sonunda istenen sonuclari elde edebilirsiniz.",
        
        "Is hayatinda cok calismaniz ve detaylara dikkat etmeniz gereken \n"
        + "bir donemde olabilirsiniz. Yaptiginiz islerin her biri, basariya \n"
        + "ulasmak icin onemlidir. Bu kart, sabirla yapilan calismalarin sonunda \n"
        + "buyuk kazanclar ve basarilar getirecegini simgeler."
    },
    
    //30(Asa Dokuzlusu)
    {
        "Bu kart, maddi basari, guven ve mutlulugun simgesidir. Maddi \n"
        + "anlamda aradiginiz guvenligi saglamis ve emeklerinizin karsiligini \n"
        + "almaya baslamissiniz. Finansal anlamda rahatlama ve istikrar donemi \n"
        + "başsliyor. Ayni zamanda, uzun vadeli guvenliginizi saglamlastirmak \n"
        + "icin attiginiz adimlarin meyvelerini aliyorsunuz.",
        
        "Iliskilerde guven ve istikrar on planda olacaktir. Partnerinizle \n"
        + "birlikte ortak bir gelecek kurmus ve duygusal acidan rahat bir donemde \n"
        + "olacaksiniz. Bu kart, iliskinizde huzur ve tatmin bulacaginiz \n"
        + "bir zamani isaret eder.",
        
        "Is hayatinda basari, guven ve finansal rahatlama donemine \n"
        + "giriyorsunuz. Calismalarinizin karsiligini almaya baslayacak ve \n"
        + "isinizde saglam temeller kurarak gelecekteki basarilarinizi \n"
        + "garanti altina alacaksiniz."
    },
    
    //31(Asa Onlusu)
    {
        "Bu kart, ailevi mutluluk, maddi guvenlik ve kalici basariyi \n"
        + "isaret eder. Maddi acidan en yuksek seviyeye ulasmis ve guvenli \n"
        + "bir yasam suruyorsunuz. Ailevi baglar guclenmis ve tum dunyadan \n"
        + "memnun bir hayat kurmussunuz. Her seyin tamamlandigi ve huzura \n"
        + "ulastiginiz bir donemi simgeler.",
        
        "Ask hayatinizda, kalici bir guven ve mutluluk soz konusu. \n"
        + "Partnerinizle birlikte hayatinizi paylasarak, maddi ve duygusal \n"
        + "olarak tatmin edici bir gelecek insa ediyorsunuz. Bu kart, \n"
        + "iliskinizde kalici bir mutlulugun gostergesidir.",
        
        "Is hayatinda finansal guvenlik ve basariya ulasmissiniz. \n"
        + "Maddi anlamda tüm hedeflerinizi gerceklectirmic ve gelecege \n"
        + "saglam adimlarla ilerliyorsunuz. Bu kart, basariyi ve guvenligi \n"
        + "simgeler, is hayatinizda her sey yolunda."
    },
    
    //32(Asa Prensi)
    {
        "Bu kart, ögrenme, firsatlar ve yeni baslangiclari temsil eder. \n"
        + "Bu kart, hayatinizda yeni bir seyler ögrenmek, becerilerinizi \n"
        + "gelistirmek veya bir hedefe odaklanmak icin bir firsatin dogdugunu \n"
        + "gosterir. Bu donem, kucuk ama saglam adimlarla ilerleyerek uzun \n"
        + "vadeli basarilar elde etmek icin harika bir zamandir. Aynı zamanda, \n"
        + "sabirli olmaniz ve detaylara dikkat etmeniz gerektigini de hatirlatir. \n"
        + "Hedeflerinize ulasmak icin planli ve caliskan bir tutum sergilemeniz onemlidir.",
        
        "Ask hayatinizda iliskiyi daha derinlemesine anlamak veya gelecege \n"
        + "yonelik planlar yapmak icin bir firsat dogabilir. Partnerinizle \n"
        + "iliskinizde guven ve istikrar olusturmak için adimlar atabilirsiniz. \n"
        + "Bekarlar icin, size karsi ciddi ve istikrarli bir yaklasim sergileyen \n"
        + "bir kisiyle tanisma olasiligi vardir. Bu kisi, iliskinin temellerini \n"
        + "saglam kurmaya onem veren biri olabilir.",
        
        "Is hayatinda yeni bir egitim, kurs ya da kariyer firsati \n"
        + "gundemde olabilir. Bu kart, yeteneklerinizi gelistirmek ve maddi \n"
        + "kazanclarinizi artirmak icin bir baslangic yapmanizi onerir. \n"
        + "Yaratici bir projeye baslama ya da kucuk caplı bir girisim uzerinde \n"
        + "calisarak ilerleme saglayabilirsiniz. Bu surecte, uzun vadeli \n"
        + "basarilar icin saglam bir temel olusturmak onemlidir; sabir ve \n"
        + "istikrar basariya ulasmanizi kolaylastiracaktir."
    },
    
    //33(Asa Şövalyesi)
    {
        "Bu kart, azim, sabir ve kararlilikla hedefe ulasmayi simgeler. \n"
        + "Her seyin adim adim ilerledigi ve somut sonuclar elde etmek icin \n"
        + "dikkatle calismaniz gereken bir donemde oldugunuzu isaret eder. \n"
        + "Bu kart, guvenilirlik ve istikrari temsil eder. Planlarinizi dikkatle \n"
        + "takip ettiginiz surece, basari sizin icin kacinilmaz olacaktir.",
        
        "Ask hayatınızda sadakat ve uzun vadeli bir baglilik on plandadir. \n"
        + "Partnerinizle birlikte guven ve saglamlik arayisinda olabilirsiniz. \n"
        + "Bu kart, iliskinizin yavas ama kararli bir sekilde gelisecegini ve \n"
        + "her iki tarafin da sabirla birbirini destekleyecegini gosterir. \n"
        + "Bekarlar icin, güvenilir bir partnerle tanisma ve uzun sureli bir \n"
        + "iliski kurma olasiligi vardir.",
        
        "Is hayatinda azim ve calikanlikla ilerleme zamani. Yavas ama \n"
        + "istikrarli bir sekilde hedeflerinize yaklasiyorsunuz. Bu kart, sabirli \n"
        + "ve planli bir calisma duzeniyle buyuk basarilara ulasabileceginizi \n"
        + "isaret eder. Projelerinizin tamamlanmasi zaman alabilir, ancak \n"
        + "sonuclar oldukca tatmin edici olacaktir."
    },
    //34(Asa Kraliçesi)
    {
        "Bu kart, maddi refah, sicaklik ve koruma hissini simgeler. \n"
        + "Bu kart, hayatiniza denge, konfor ve guven getiren bir donemi \n"
        + "isaret eder. Maddi kaynaklarinizi ve duygusal ihtiyaclarinizi uyum \n"
        + "icinde yonettiginiz bir donemdesiniz. Bu kart ayni zamanda doga ile \n"
        + "baglantı kurma ve basit yasamın keyfini cikarma zamani \n"
        + "oldugunu da gösterebilir.",
        
        "Ask hayatinizda sefkat, sadakat ve derin bir duygusal bag on \n"
        + "plandadir. Partnerinizle birlikte saglam ve guvenilir bir iliski \n"
        + "kurmus olabilirsiniz. Bu kart, partnerinizin size karsi duydugu \n"
        + "sevgiyi pratik yollarla gösterdigini ve iliskinizde huzur ve mutluluk \n"
        + "buldugunuzu isaret eder. Bekarlar icin, anlayisli ve guvenilir bir \n"
        + "kisiyle tanisma olasiligi yuksektir.",
        
        "Is hayatinda basari ve maddi guvenligi temsil eder. Calismalarinizin \n"
        + "sonuclari artik somut bir sekilde gorulmeye baslanabilir. Bu kart, \n"
        + "finansal acidan guvende oldugunuz ve kariyerinizde istikrarli bir \n"
        + "doneme girdiginizi gösterir. Ayni zamanda liderlik becerilerinizle \n"
        + "cevrenizdekilere ilham verebilirsiniz."
    },
    
    //35(Asa Kralı)
    {
        "Bu kart, maddi basari, guc ve liderligi simgeler. Bu kart, \n"
        + "guven ve kararlilikla hedeflerinize ulastiginizi ve artik diger \n"
        + "insanlara da rehberlik edebileceginizi gosterir. Maddi dunyada \n"
        + "ustalik kazanmis, kaynaklarinizi akillica yoneten ve baskalarina \n"
        + "ilham olan bir donemdesiniz.",
        
        "İliskilerde guven ve sadakat on plandadir. Partnerinizle birlikte \n"
        + "maddi ve manevi olarak istikrarli bir iliski kurmus olabilirsiniz. \n"
        + "Bu kart, iliskinizin saglam temeller uzerine kuruldugunu ve uzun \n"
        + "vadeli bir mutluluga ulastiginizi isaret eder. Bekarlar icin, \n"
        + "hayatiniza guvenilir, basarili ve koruyucu bir partner girme \n"
        + "olasiligi vardir.",
        
        "Is hayatinda zirveye ulasmis ve basariyi saglamis durumdasiniz. \n"
        + "Maddi anlamda buyuk kazanclar elde ettiginiz bir doneme girdiniz. Bu kart, \n"
        + "liderlik rolunuzu basariyla ustlendiginizi ve cevrenizdeki insanlara \n"
        + "rehberlik ettiginizi gösterir. Ayni zamanda yatirimlarinizin buyuk \n"
        + "kazanclar getirecegini de simgeler."
    },
    
    //36(Kupa Ası)
    {
        "Bu kart, duygusal bir yenilik ve kalbinizle ilgili derin bir \n"
        + "uyanisi temsil eder. Yeni bir iliski, icsel bir huzur ya da duygusal \n"
        + "bir baslangic arayisinda olabilirsiniz. Kendi duygusal ihtiyaclarinizi \n"
        + "daha iyi anlamak ve bunları hayatiniza entegre etmek, sizi yeni bir \n"
        + "sevgi ve mutluluk seviyesine tasiyacaktir.",
        
        "Bu kart, romantik bir iliskinin baslangicini isaret eder ve \n"
        + "duygusal anlamda guclu bir bag kurma potansiyeli tasir. Kalbiniz \n"
        + "saf ve acik, bu da yeni bir aska ya da iliskinize kendinizi tamamen \n"
        + "acmaniza olanak tanir. Bekarlar icin, hayatiniza girecek birinin \n"
        + "duygusal anlamda derin bir bag kurabilecegi bir donemdesiniz.",
        
        "Is hayatinda, duygusal acidan tatmin edici bir donemde \n"
        + "olabilirsiniz. Kendinizi isinizde daha mutlu ve huzurlu hissediyorsunuz, \n"
        + "bu da daha yaratici ve verimli olmaniza yol acacaktir. Is yerindeki \n"
        + "iliskilerinizde de duygusal bir denge kurarak basarili adimlar atabilirsiniz."
    },
    
    //37(Kupa İkilisi)
    {
        "Bu kart, bir iliski veya yakin bagda dengeli ve uyumlu bir \n"
        + "iletisimi simgeler. Bir kisiyle ya da durumla ilgili duygusal baginizi \n"
        + "derinlestirmeniz ve karsilikli anlayis icinde olmaniz gereken bir \n"
        + "donemdesiniz. Iki tarafli bir paylasim ve isbirligi bu donemin anahtari olacaktir.",
        
        "İliskinizde uyum ve dengeyi buldugunuz bir donemdesiniz. \n"
        + "Partnerinizle duygusal acidan birbirinize yakin ve guven dolusunuz. \n"
        + "Birlikte buyumek, iliskinizi daha saglam temeller uzerine insa etmek \n"
        + "icin harika bir zaman. Bekarlar icin, kalbinizin derinliklerine inerek \n"
        + "anlamli bir iliski kurma potansiyeliniz var.",
        
        "Is yerinde guclu bir isbirligi ya da ortaklik donemi basliyor. \n"
        + "Duygusal anlamda rahat ve uyumlu bir calisma ortami yaratmak, verimli \n"
        + "bir donemi isaret eder. Bu kart, birbirinizi destekleyerek basariya \n"
        + "ulasmaniz icin gerekli olan uyumu ve dengeyi saglar."
    },
    
    //38(Kupa Üçlüsü)
    {
        "Bu kart, kutlama, sevinc ve duygusal tatminin simgesidir. Bu kart, \n"
        + "mutlu bir birlikteligin, arkadas cevresindeki bir etkinligin ya da \n"
        + "ozel bir anin yasanacagi bir donemi isaret eder. Kalbinizde huzur ve \n"
        + "mutluluk olacak, etrafinizdaki insanlarla bu enerjiyi paylasarak \n"
        + "kendinizi daha iyi hissedeceksiniz.",
        
        "İliskinizde sevgi, anlayis ve tatmin dolu bir döneme adim atiyorsunuz. \n"
        + "Birlikte kutlayacaginiz basarilar ve mutluluk anlari, iliskinizin \n"
        + "guclenmesine katki saglar. Bu kart, partnerinizle eglenceli ve keyifli \n"
        + "bir zaman gecireceginiz bir donemi simgeler. Bekarlar icin, sosyal \n"
        + "cevredeki etkinlikler yeni bir aska zemin hazirlayabilir.",
        
        "Is yerinde bir basariyi kutlamak ya da takim calismasinin \n"
        + "getirdigi bir zafer yasanabilir. Ortak projelerde saglanan basarilar \n"
        + "ve iyi iliskiler, sizi mutlu kilacaktir. Bu donem, is arkadaslarinizla \n"
        + "birlikte kutlama yapacaginiz bir zaman dilimi olabilir."
    },
    
    //39(Kupa Dörtlüsü)
    {
        "Bu kart, bir duygusal durgunluk ve tatminsizlik hissini isaret eder. \n"
        + "Hayatinizda ya da bir iliskinizde tatmin eksikligi ya da memnuniyetsizlik \n"
        + "soz konusu olabilir. Bu durum, kendinize ve cevrenize bakis acinizi degistirmeniz \n"
        + "gerektigini gosteriyor. Kendi duygusal ihtiyaclarinizi yeniden degerlendirmek, \n"
        + "duygusal iyilesmenize yardimci olabilir.",
        
        "İliskide duygusal olarak sikismis ve tatminsiz hissedebilirsiniz. \n"
        + "Partnerinizle olan baginizi tekrar gozden gecirebilir ve iliskinize \n"
        + "yeni bir soluk getirmek icin adimlar atabilirsiniz. Bekarlar icin, \n"
        + "gecmis iliskilerden gelen duygusal acilar ya da hayal kirikliklari, \n"
        + "yeni bir baslangicin onunde engel olabilir.",
        
        "ıs yerinde, mevcut durumunuzdan memnuniyetsizlik yasayabilirsiniz. \n"
        + "Hedeflerinize ulasmak icin daha fazla caba sarf etmeniz gerekebilir. \n"
        + "Bu durum, isinizi sevmediginiz ya da tatmin olmadiginiz bir donemi isaret \n"
        + "ediyor olabilir. Yeniden degerlendirme yapmak, daha iyi bir yol \n"
        + "haritasi cizmenize yardimci olabilir."
    },
    
    //40(Kupa Beşlisi)
    {
        "Bu kart, gecmisteki kayiplar ve duygusal acilarin izlerini tasiyan \n"
        + "bir donemi temsil eder. Ancak bu kayiplar, yeniden baslayabilmek \n"
        + "ve gelecege odaklanabilmek icin bir firsat sunar. Bunu asmak icin \n"
        + "derin bir icsel yolculuga cıkmaniz ve aciyi kabul etmeniz gerekebilir.",
        
        "İliskide hayal kirikligi ve kayiplar yasanmis olabilir. Bu durum, \n"
        + "duygusal olarak zorlayici olsa da, gecmisin acilarini geride birakmak icin \n"
        + "bir firsat sunar. Yeni bir ask ya da iyilesmis bir iliski, yakin \n"
        + "gelecekte sizi bekliyor olabilir.",
        
        "Is hayatinda bir basarisizlik ya da kayiplar soz konusu olabilir. \n"
        + "Ancak bu donemde kendinizi toparlamak ve yeni firsatlari kucaklamak \n"
        + "icin guc bulmalisiniz. Gecmisteki deneyimleriniz, sizi daha \n"
        + "saglam bir temele oturtacak."
    },
    
    //41(Kupa Altılısı)
    {
        "Gecmisteki guzel anilari hatirlama ve duygusal baglari yeniden \n"
        + "canlandirma zamani. Bu kart, eski iliskilerinizi ya da gecmisteki \n"
        + "tatli anilari dusunmenizi isaret eder. Ayrica gecmisin guzel \n"
        + "taraflarini takdir ederek, simdiki zamana daha olumlu bir sekilde \n"
        + "odaklanmaniza yardimci olabilir.",
        
        "İliskinizde nostaljik bir donem baslayabilir. Eski anilari canlandirmak \n"
        + "ve gecmisteki mutlu zamanlari tekrar yasamak, iliskinizde daha guclu bir \n"
        + "bag kurmaniza yardimci olacaktir. Bekarlar icin, eski bir ask ya da \n"
        + "gecmisteki bir iliski yeniden gundeme gelebilir.",
        
        "Is hayatinizda gecmiste basariyla yaptiginiz bir ise geri \n"
        + "donme ya da eski baglantilarla yeniden isbirligi yapma donemi olabilir. \n"
        + "Bu kart, eski projelerden ya da eski is arkadaslarinizdan fayda \n"
        + "saglayabileceginizi isaret eder."
    },
    
    //42(Kupa Yedilisi)
    {
        "Bu kart, duygusal bir secim ve dikkatli kararlar almayi simgeler. \n"
        + "Hayatinizda pek cok secenek olabilir, ancak hangi yolu sececeginize \n"
        + "karar verirken dikkatli olmalisiniz. Seceneklerinizi degerlendirirken, \n"
        + "kalbinizi ve aklinizi dengelemeniz onemli olacaktir.",
        
        "İliskide bircok duygusal secenek olabilir, ancak hangi yolu sececeginiz \n"
        + "konusunda belirsizlik yasanabilir. Kendinize durust olup, hangi \n"
        + "iliski ya da kisiyle daha saglıklı bir bag kurabileceginizi \n"
        + "belirlemek bu donemin anahtaridir.",
        
        "Is hayatinda birkac secenek ya da firsat karsisinda kalabilirsiniz. \n"
        + "Ancak bunlar arasinda dikkatli bir secim yapmalisiniz. Hangi firsatin \n"
        + "size uzun vadede fayda saglayacagini gormek icin her birini \n"
        + "dikkatle degerlendirin."
    },
    
    //43(Kupa Sekizlisi)
    {
        "Bu kart, duygusal bir hayal kirikliginin ve birakmanin simgesidir. \n"
        + "Hayatinizda onemli bir seyi ya da iliskiyi geride birakmaniz gerekebilir. \n"
        + "Bu terk etme sureci zor olsa da, ilerlemek icin gerekli bir adimdir. \n"
        + "Eski baglardan kurtulmak, size daha saglikli ve yeni bir baslangic \n"
        + "yapma firsati sunar.",
        
        "İliskide duygusal tatminsizlik ve sikilma hissi yogunlasabilir. \n"
        + "Belki de iliskide eski duygular kaybolmus ve baglar zayıflamis olabilir. \n"
        + "Bu kart, bir iliskiyi terk etmek ya da eski kaliplardan cikmak icin \n"
        + "gereken gucu bulmaniza yardimci olabilir. Bekarlar icin, gecmiste \n"
        + "yasadiginiz bir iliskiyi tamamen geride birakmak ve gelecege \n"
        + "odaklanmak gerekebilir.",
        
        "Is hayatinda, sizi tatmin etmeyen bir projeyi ya da durumu \n"
        + "terk etmek gerekebilir. Eski bir isin veya gorevdeki bosluklarin sizi \n"
        + "duygusal olarak tukettigini hissedebilirsiniz. Ancak bu terk etme \n"
        + "sureci, size daha uygun ve tatmin edici yeni firsatlar yaratacaktir."
    },
    
    //44(Kupa Dokuzlusu)
    {
        "Bu kart, duygusal tatminin zirveye ulastigi ve kalbinizin huzur \n"
        + "buldugu bir donemi isaret eder. Duygusal olarak rahatladiginiz, huzur \n"
        + "buldugunuz ve etrafinizdaki insanlarla derin baglar kurdugunuz bir zaman \n"
        + "dilimi baslıyor. Basari, mutluluk ve tatmin duygusu bu donemde sizi saracaktir.",
        
        "İliskide tam anlamiyla duygusal tatmini bulmussunuzdur. Kalbinizde huzur, \n"
        + "mutluluk ve derin bir bag vardir. Birlikte paylasilan anlar, iliskinizi \n"
        + "daha guclu ve anlamli kilmaktadir. Bekarlar icin, kalbinizi acmak ve \n"
        + "saglikli bir iliskiye adim atmak icin mukemmel bir zaman dilimidir.",
        
        "Is hayatinda buyuk bir tatmin duygusu ve basari yasanabilir. \n"
        + "Yaptiginiz isler ve elde ettiginiz basarilar, sizi tatmin edecek ve \n"
        + "huzur verecektir. Is arkadaslarinizla guclu bir bag kurarak, basarili \n"
        + "bir ekip calismasi yapmaniz olasidir."
    },
    
    //45(Kupa Onlusu)
    {
        "Bu kart, duygusal bir mutluluk ve huzurun tamamlanmasidir. Aile, \n"
        + "dostlar ve yakin cevrenizle birlikte kutlayacaginiz bir mutluluk donemi \n"
        + "basliyor. Aile baglari guclenebilir ve cevrenizdeki insanlar ile aranizda \n"
        + "sevgi ve saygi dolu bir ortam olusabilir. Bu, hayatinizin en tatmin \n"
        + "edici anlarindan biridir.",
        
        "Ask ve mutluluk konusunda zirveye ulasmis bir donemdesiniz. \n"
        + "İliskinizde tam anlamiyla mutlusunuz ve partnerinizle guclu bir bag \n"
        + "kurmussunuz. Ileriye donuk saglam bir iliski icin temeller atilabilir. \n"
        + "Bekarlar icin, yeni bir aska adim atmak ve derin bir bag kurmak \n"
        + "icin mukemmel bir donemdir.",
        
        "Is hayatinda ailevi bir basari ve mutluluk donemini isaret eder. \n"
        + "Bir takim ya da is arkadaslarinizla birlikte onemli bir basariyi \n"
        + "kutlayabilirsiniz. Hem kisisel hem de profesyonel anlamda huzur ve \n"
        + "tatmin bulacaginiz bir donemin habercisidir."
    },
    
    //46(Kupa Prensi)
    {
        "Bu kart, duygusal kesif ve yeni bir ask baslangicini simgeler. \n"
        + "Kalbiniz duygusal anlamda yeni bir yolculuga cikmaya hazirdir ve yeni \n"
        + "bir sevgiyi ya da icsel huzuru kesfetmeye aciksiniz. Bu kart ayni \n"
        + "zamanda sezgisel bir uyanisi da isaret eder; kalbiniz, size \n"
        + "dogru yolu gosterebilir.",
        
        "Ask konusunda heyecan verici ve yeni bir baslangic yapabilirsiniz. \n"
        + "Kalbiniz saf ve acik, bu da yeni bir iliskiye baslamayi ya da var olan \n"
        + "iliskideki baglari derinlestirmeyi isaret eder. Bekarlar icin, hayatiniza \n"
        + "yeni bir ask girebilir ve bu ask sizi icsel bir donusume goturebilir.",
        
        "Is hayatinda yeni bir firsat ya da gorev sizi bekliyor olabilir. \n"
        + "Duygusal olarak bu is, sizi tatmin edecek ve buyutecek bir deneyim \n"
        + "olabilir. Ileriye donuk yaratici fikirler ve projeler icin de \n"
        + "uygun bir zaman dilimindesiniz."
    },
    
    //47(Kupa Şövalyesi)
    {
        "Bu kart, duygusal bir baglilik ve sevgiyi simgeler. Romantik \n"
        + "anlamda cesur bir adim atmaya karar verdiginiz bir doneme giriyorsunuz. \n"
        + "Icsel gucunuzle ve duygusal cesaretle bir adim atarak, kalbinizdeki \n"
        + "tutkulari ve hayalleri gercege donusturebilirsiniz.",
        
        "İliskide heyecanli ve duygusal bir donusum yasanabilir. Sevgilinizle \n"
        + "daha derin bir bag kurabilir ve iliskinizdeki romantizmi yeniden \n"
        + "kesfedebilirsiniz. Bu kart, askta cesaret ve guveni simgeler. \n"
        + "Bekarlar icin, kalpten bir aska adim atmaniz ve bir iliskiye cesurca \n"
        + "ilerlemeniz olasiliklar dahilindedir.",
        
        "Is hayatinda yaratici ve cesur bir yaklasim benimseyebilirsiniz. \n"
        + "Bu donemde duygusal olarak tatmin edici isler yapma, tutkularinizi \n"
        + "kariyerinize yansitma sansiniz olabilir. Ayrıca is arkadaslarinizla \n"
        + "yaratici projelerde isbirligi yaparak daha guclu baglar kurabilirsiniz."
    },
    
    //48(Kupa Kraliçesi)
    {
        "Bu kart, duygusal denge, icsel huzur ve sezgiyi temsil eder. \n"
        + "Kendinize ve cevrenize duyarli ve nazik bir yaklasim icinde oldugunuz \n"
        + "bir donemdesiniz. Kendi duygusal ihtiyaclarinizi karsilama konusunda \n"
        + "derin bir farkindalik ve anlayis gelistiriyorsunuz.",
        
        "İliskide duygusal denge ve anlayisa sahip oldugunuz bir donemdesiniz. \n"
        + "Partnerinizle guclu bir bag kurarak, ona karsi derin bir sefkat \n"
        + "ve sevgi gosteriyorsunuz. Bekarlar icin, kalpten bir iliski kurmaya \n"
        + "ve duygusal olarak tatmin edici bir bag yaratmaya aciksiniz.",
        
        "Is hayatinda sezgilerinizi ve duygusal zekanizi kullanarak \n"
        + "basarili adimlar atabilirsiniz. Hem is yerindeki iliskilerde hem de \n"
        + "kisisel projelerde, empati ve duyarliliginiz sayesinde verimli bir \n"
        + "donem sizi bekliyor. Bu kart, duygusal zekanizla onemli kararlar \n"
        + "alabileceginizi isaret eder."
    },
    
    //49(Kupa Kralı)
    {
        "Bu kart, olgunluk, duygusal denge ve liderligi temsil eder. \n"
        + "Kendinizi duygusal olarak dengede hissettiginiz ve duygusal acidan \n"
        + "guvenli bir pozisyonda oldugunuz bir doneme giriyorsunuz. Hem kendinize \n"
        + "hem de baskalarina duyarli ve nazik bir yaklasim icinde olabilirsiniz.",
        
        "İliskide olgun, guven dolu ve anlayisli bir yaklasim sergiliyorsunuz. \n"
        + "Partnerinizle duygusal anlamda derin bir bag kurmussunuz ve iliskiniz \n"
        + "saglam temeller uzerinde duruyor. Bekarlar icin, olgun ve duygusal \n"
        + "anlamda uyumlu bir iliskiye adim atma zamani olabilir.",
        
        "Is hayatinda liderlik rolu ustlenebilirsiniz. Duygusal zekanız \n"
        + "sayesinde is yerinde huzurlu ve verimli bir ortam yaratabilir, \n"
        + "insanlarla guclu baglar kurabilirsiniz. Bu kart, yonetici ve lider \n"
        + "pozisyonlarina isaret eder ve duygusal olgunlukla kararlar almayi gösterir."
    },
    
    //50(Kılıç Ası)
    {
        "Hayatinizda yeni bir fikir ya da farkindalik isigiyla onemli \n"
        + "bir baslangic yapiyorsunuz. Zihinsel netlik ve cozum uretme yeteneginiz, \n"
        + "karsilastiginiz sorunlari hizlica cozebilmenizi saglayacak. Bu kart, \n"
        + "durustluk ve mantikla hareket ederek dogru kararlar almanizi tesvik \n"
        + "eder ve basariya ulasmanin onunu acar.",
        
        "İliskinizde netlik kazanma ve durust bir iletisim kurma zamani. \n"
        + "Partnerinizle acikca konusmak, iliskinizin saglam bir temele oturmasini \n"
        + "saglayabilir. Bekarlar icin bu kart, mantikli bir sekilde dusundugunuzde \n"
        + "duygusal hayatiniza yeni bir sayfa acabileceginizi gosterir.",
        
        "Yeni bir fikir ya da zihinsel bir atilim is hayatinizda buyuk \n"
        + "bir degisim yaratabilir. Kararlarinizi analitik bir sekilde degerlendirerek \n"
        + "ilerlerseniz, basari kacinilmaz olacaktir. Bu donemde mantiginiz \n"
        + "ve zekaniz, kariyer hedeflerinize ulasmanizda en buyuk gucunuz olacak."
    },
    
    //51(Kılıç İkilisi)
    {
        "Hayatinizdaki bir kararsizlik ya da iki secenek arasinda \n"
        + "sikismislik hissi ile mucadele ediyorsunuz. Bu durum, duygularinizla \n"
        + "mantiginiz arasinda bir denge kurmaniz gerektigini gosteriyor. \n"
        + "Karar almak zor olsa da, ilerlemek icin bu durumu cozmelisiniz. \n"
        + "Uzun sure beklemek sizi daha da zor bir noktaya goturebilir.",
        
        "İliskide cozulmesi gereken bir mesele ya da alinmasi gereken bir \n"
        + "karar olabilir. Ancak su an kararsizlik icinde olmaniz nedeniyle \n"
        + "duygusal olarak tikaniklik hissedebilirsiniz. Partnerinizle acik bir \n"
        + "sekilde konusmak, bu durumu asmaniza yardimci olabilir.",
        
        "Is hayatinizda onemli bir karar asamasindasiniz, ancak secenekler \n"
        + "arasinda net bir secim yapmakta zorlanabilirsiniz. Bu karari almak \n"
        + "icin detayli dusunmeli ve her iki secenegin de sonuclarini \n"
        + "dikkatlice degerlendirmelisiniz."
    },
    
    //52(Kılıç Üçlüsü)
    {
        "Aci, hayal kirikligi ve uzuntuyu temsil eden bu kart, \n"
        + "hayatinizdaki zor bir donemi isaret eder. Ancak bu surec, duygusal \n"
        + "olarak olgunlasmaniza ve gecmisteki yaralari sarmak icin bir \n"
        + "firsat yaratir. Yasadiginiz zorluklar, ileride daha guclu bir \n"
        + "sekilde yeniden dogmaniza yardimci olacaktir.",
        
        "İliskide bir ayrilik, hayal kirikligi ya da ihanet gibi duygusal \n"
        + "acidan zorlu bir surecle karsilasabilirsiniz. Bu durum her ne kadar \n"
        + "zor olsa da, duygularinizi iyilestirerek kendinizi daha guclu bir \n"
        + "sekilde yeniden insa etmeniz mumkun.",
        
        "Is hayatinda basarisizlik ya da hayal kirikligi yasanabilir. \n"
        + "Ancak bu surec, size onemli dersler ogreterek gelecekte daha saglam \n"
        + "adimlar atmanizi saglayacaktir. Yasadiginiz bu deneyim, ilerleyen \n"
        + "sureclerde daha buyuk basarilar elde etmenize katki saglayabilir."
    },
    
    //53(Kılıç Dörtlüsü)
    {
        "Dinlenme, ice cekilme ve yenilenme zamani. Hayatinizdaki yogunluktan \n"
        + "ya da stresli durumlardan bir adim geri cekilerek, zihinsel ve \n"
        + "fiziksel sagliginiza oncelik vermelisiniz. Bu surec, enerjinizi \n"
        + "yeniden toplamaniza ve gelecege daha saglam adimlarla \n"
        + "ilerlemenize yardimci olacaktir.",
        
        "İliskide bir ara verme ya da duygusal anlamda kendinizi \n"
        + "toparlama zamani. Partnerinizle olan baginizi yeniden guclendirmek \n"
        + "icin bir sure kendinize odaklanmaniz gerekebilir. Bu mola, iliskinizde \n"
        + "daha saglıklı bir dinamik olusturmaniza yardimci olabilir.",
        
        "Is hayatinda kendinizi asiri yormus ya da tukenmis hissedebilirsiniz. \n"
        + "Bu nedenle bir sure dinlenmek ve enerjinizi yenilemek, uzun vadede \n"
        + "basarilarinizi artiracaktir. Kendinizi daha guclu bir sekilde geri \n"
        + "donmeye hazirlamalisiniz."
    },
    
    //54(Kılıç Beşlisi)
    {
        "Catisma, kayip ya da zor bir durumla karsi karsiyasiniz. \n"
        + "Ancak bu surec, size dogruyu yanlistan ayirmayi ve hayatta ileriye \n"
        + "nasil daha saglam adimlarla devam edeceginizi ogretebilir. \n"
        + "Kazandiginiz ya da kaybettiginiz seylerden bagimsiz olarak, bu \n"
        + "durumdan ders alarak ilerlemek onemlidir.",
        
        "İliskide bir tartisma ya da yanlis anlasilma, iki tarafin da \n"
        + "yipranmasina neden olabilir. Ancak bu durum, iliskinizin daha guclu \n"
        + "bir hale gelmesi icin bir firsat yaratabilir. Partnerinizle acik ve \n"
        + "durust bir sekilde iletisim kurmaniz, bu catismayi cozmenizi saglayabilir.",
        
        "Is hayatinda rekabet ya da anlasmazliklar yasanabilir. \n"
        + "Ancak bu surecte alacaginiz dersler ve gostereceginiz kararlilik, \n"
        + "kariyerinizdeki ilerlemenizde onemli bir rol oynayacaktir. Durumu sakin \n"
        + "bir sekilde ele almak size avantaj saglayabilir."
    },
    
    //55(Kılıç Altılısı)
    {
        "Zor bir donemden uzaklasarak daha sakin ve huzurlu bir surece \n"
        + "adim atiyorsunuz. Bu kart, gecmiste yasanan sikintilardan uzaklasmayi \n"
        + "ve gelecege umutla bakmayi temsil eder. Fiziksel ya da duygusal bir \n"
        + "yolculugun baslangicinda olabilirsiniz.",
        
        "İliskide gecmiste yasanan sorunlari geride birakma ve birlikte \n"
        + "daha huzurlu bir donem baslatma zamani. Bekarlar icin bu kart, gecmisteki \n"
        + "duygusal yaralarin iyilesmesiyle yeni bir iliskiye kapi acildigini gösterebilir.",
        
        "Is hayatinda yasanan stresli bir donemi geride birakiyor ve \n"
        + "daha huzurlu bir surec baslatiyorsunuz. Bu gecis, kariyerinizde yeni ve \n"
        + "olumlu bir baslangica isaret ediyor olabilir."
    },
    
    //56(Kılıç Yedilisi)
    {
        "Gizlilik, strateji ve dikkat gerektiren bir donemdesiniz. \n"
        + "Bazi durumlarda kendinizi ya da planlarinizi korumak icin daha dikkatli \n"
        + "hareket etmeniz gerekebilir. Bu kart, zeki ve stratejik olmayi, \n"
        + "ancak durustlukten sapmamayi ugutler.",
        
        "İliskide gizli kalan bir konu ya da durustluk eksikligi gundeme \n"
        + "gelebilir. Acik bir iletisim kurarak, bu durumu cozmek iliskiniz icin \n"
        + "daha saglikli bir yol acabilir.",
        
        "Is hayatinda stratejik adimlar atmaniz gereken bir donemdesiniz. \n"
        + "Gizli bir proje ya da dikkatle korunmasi gereken bir fikir üzerinde \n"
        + "calisiyor olabilirsiniz."
    },
    
    //57(Kılıç Sekizlisi)
    {
        "Kendi korkulariniz ve zihinsel sinirlamalariniz nedeniyle \n"
        + "kendinizi sikismis hissedebilirsiniz. Ancak bu sinirlamalar gercek \n"
        + "olmaktan cok, kendi dusuncelerinizden kaynaklaniyor olabilir. \n"
        + "Cesurca hareket etmeye karar verdiginizde, bu durumdan cikis yolu \n"
        + "bulabilirsiniz. Kendinizi ozgurlestirmek icin dusunce kaliplarinizi \n"
        + "gozden gecirmeniz gerekecek.",
        
        "İliskide duygusal olarak kisitlanmis ya da bastirilmis hissedebilirsiniz. \n"
        + "Bu durum, iletisim eksikliginden ya da iliskinizde hissettiginiz \n"
        + "baskidan kaynaklaniyor olabilir. Duygularinizi acikca ifade etmek, \n"
        + "iliskinizdeki bu tikanikligi asmaniza yardimci olacaktir.",
        
        "Is hayatinda bir proje ya da durum sizi sikismis ve caresiz \n"
        + "hissettirebilir. Ancak bu sinirlamalarin bircogu kendi zihinsel \n"
        + "engellerinizden kaynaklaniyor olabilir. Farkli bir bakis acisi \n"
        + "gelistirerek bu durumu asabilirsiniz."
    },
    
    //58(Kılıç Dokuzlusu)
    {
        "Korkular, endiseler ve uykusuz gecelerle dolu bir donemi \n"
        + "temsil eder. Zihinsel stres ve karamsar dusunceler, kendinizi daha da \n"
        + "kotu hissetmenize neden olabilir. Ancak bu durumun cogunlukla zihinsel \n"
        + "abartilar oldugunu fark ettiginizde, bir cozum yolu bulabileceksiniz. \n"
        + "Duygusal destek almak, bu sureci daha kolay atlatmaniza yardimci olabilir.",
        
        "İliskide endiseleriniz ve korkulariniz nedeniyle zor bir donem yasiyor \n"
        + "olabilirsiniz. Bu durum, partnerinizle acik bir sekilde konusarak ya da \n"
        + "duygularinizi anlamaya calisarak cozulebilir. Bekarlar icin bu kart, \n"
        + "gecmisteki korkularin yeni bir iliskiye baslamayi engelledigini gosterebilir.",
        
        "Is hayatinda stresli bir donemdesiniz ve belki de basarisizlik \n"
        + "ya da yanlis kararlar verme korkusu sizi etkiliyor olabilir. Ancak \n"
        + "bu endiselerin gerceklerden cok zihinsel birer kurgudan ibaret \n"
        + "oldugunu fark etmek, cozum bulmaniza yardimci olacaktir."
    },
    
    //59(Kılıç Onlusu)
    {
        "Zor bir sonlanma ya da hayal kirikligini temsil eder. Hayatinizin \n"
        + "bir alaninda artik tamamen biten bir durumla karsilasabilirsiniz. \n"
        + "Ancak bu son, yeni bir baslangicin yolunu acacaktir. Her ne kadar \n"
        + "aci verici olsa da, bu surec size dayaniklilik kazandirarak \n"
        + "gelecekte daha guclu olmanizi saglayacaktir.",
        
        "İliskide sona erme ya da agir bir hayal kirikligi yasanabilir. \n"
        + "Ancak bu surec, yeni bir baslangic icin gereken temizlik ve arinmayi \n"
        + "temsil eder. Acinizi kabullenmek, duygusal iyilesmenin ilk adimi olacaktir.",
        
        "Is hayatinda bir projeyi ya da mevcut bir durumu sonlandirmak \n"
        + "zorunda kalabilirsiniz. Bu durum baslangicta zor gorunse de, uzun \n"
        + "vadede size yeni firsatlarin kapisini acacaktir. Gecmisi geride birakmak, \n"
        + "ilerlemeniz icin bir zorunluluk haline gelebilir."
    },
    
    //60(Kılıç Prensi)
    {
        "Yeni bilgi arayisi, merak ve zihinsel hareketliligi temsil eder. \n"
        + "Bu kart, ogrenmeye acik oldugunuz ve hayatinizdaki durumlari analiz \n"
        + "etmek icin keskin bir zihinle hareket ettiginiz bir donemi isaret eder. \n"
        + "Ancak bazen fazla merakli davranmak, baskalarinin özel alanina \n"
        + "mudahale etmenize neden olabilir.",
        
        "İliskide partnerinizi daha iyi anlamak ve duygularinizi analiz \n"
        + "etmek icin caba sarf ediyorsunuz. Ancak fazla sorgulayici davranmak \n"
        + "yerine, akista kalmayi ogrenmek iliskiniz icin daha faydali olacaktir. \n"
        + "Bekarlar icin bu kart, bir iliskiye dair merak ve heves dolu bir \n"
        + "donemi temsil eder.",
        
        "Is hayatinda yeni bilgiler edinmek, arastirmalar yapmak ve \n"
        + "zihinsel olarak aktif bir sekilde calismak sizi basariya goturebilir. \n"
        + "Ancak detaylara cok fazla odaklanarak buyuk resmi kacirmamaya dikkat etmelisiniz."
    },
    
    //61(Kılıç Şövalyesi)
    {
        "Bu kart, hizli hareket, cesaret ve kararliligi temsil eder. Hedeflerinize \n"
        + "ulasmak icin tum gucunuzle harekete gectiginiz bir donemdesiniz. \n"
        + "Ancak bu surecte, aceleci davranarak detaylari gozden kacirma riski \n"
        + "tasiyabilirsiniz. Dusunmeden hareket etmekten kacinin ve adimlarinizi \n"
        + "dikkatle planlayin.",
        
        "İliskide heyecanli ve hizli gelismeler yasayabilirsiniz. \n"
        + "Ancak bu durum, bazen sabirsiz davranmaniza ve iliskinizde gerilim \n"
        + "yaratmaniza neden olabilir. Dengeli bir tutum sergileyerek \n"
        + "partnerinizle uyum icinde hareket etmek onemlidir.",
        
        "Is hayatinda hedeflerinize ulasmak icin hizli ve cesur bir \n"
        + "sekilde ilerliyorsunuz. Ancak bu surecte detaylara dikkat etmeli ve \n"
        + "aceleci kararlar almaktan kacinmalisiniz. Stratejik bir yaklasim, \n"
        + "basariya daha emin adimlarla ulasmanizi saglayacaktir."
    },
    
    //62(Kılıç Kraliçesi)
    {
        "Bu kart, mantik, objektiflik ve netligi temsil eder. Bu donem, \n"
        + "duygularinizi bir kenara birakarak olaylara daha analitik bir \n"
        + "gozle bakmaniz gerektigini gosterir. Kararlarinizda durustluk ve \n"
        + "gercekciligi on planda tutarak, hayatinizdaki sorunlari cozebilirsiniz.",
        
        "İliskide netlik ve gercekci bir tutum sergiliyorsunuz. Duygusal \n"
        + "olarak kendinizi daha guclu hissettiginiz bu donemde, iliskinizin dinamiklerini \n"
        + "dogru bir sekilde analiz edebilirsiniz. Bekarlar icin bu kart, \n"
        + "mantikli bir sekilde ilerlenmesi gereken bir iliskiyi isaret eder.",
        
        "Is hayatinda analitik dusunce gucunuzle on plana cikiyorsunuz. \n"
        + "Mantikli kararlar alarak ve stratejik bir sekilde hareket ederek basariya \n"
        + "ulasabilirsiniz. Insanlarla iletisiminizde net ve durust bir yaklasim \n"
        + "sergilemeniz, kariyerinizde size avantaj saglayacaktir."
    },
    
    //63(Kılıç Kralı)
    {
        "Otorite, liderlik ve zihinsel gucun temsilcisidir. Bu kart, olaylara \n"
        + "objektif ve adil bir sekilde yaklasmaniz gerektigini gosterir. \n"
        + "Kararlarinizi mantik cercevesinde alarak, hayatinizda duzen ve kontrol \n"
        + "saglamaniz mumkun olacaktir.",
        
        "İliskide olgunluk ve kararlilikla hareket ettiginiz bir donemdesiniz. \n"
        + "Partnerinizle guclu bir bag kurarak iliskinizi daha saglam bir temele \n"
        + "oturtabilirsiniz. Bekarlar icin bu kart, mantik ve duygular arasinda \n"
        + "denge kurarak dogru bir iliskiyi secmeniz gerektigini ifade eder.",
        
        "Is hayatinda liderlik yeteneklerinizle on plana cikiyorsunuz. \n"
        + "Mantikli, stratejik ve adil bir yaklasimla kariyerinizde onemli basarilara \n"
        + "imza atabilirsiniz. Zihinsel gucunuz ve kararliliginiz, sizi her turlu \n"
        + "zorlugun ustesinden getirebilecek bir noktaya tasiyacaktir."
    },
    
    //64(Değnek Ası)
    {
        "Bu kart, yaraticilik, enerji ve yeni baslangiclari simgeler. \n"
        + "Hayatiniza taze bir enerji girebilir, yeni projeler ve fikirler gelistirmek \n"
        + "icin hevesli hissedebilirsiniz. Bu kart, motivasyonunuzun yuksek oldugu \n"
        + "ve harekete gecmek icin dogru bir zamanda oldugunuzu gosterir. Yaraticilik \n"
        + "ve tutku dolu bir donemdesiniz; bu enerjiyi iyi degerlendirirseniz, \n"
        + "buyuk basarilar elde edebilirsiniz.",
        
        "Ask hayatinizda heyecan verici bir baslangic ya da tutkuyu yeniden \n"
        + "kesfetme zamani olabilir. Mevcut iliskinizde tutkuyu artiracak yeni bir \n"
        + "doneme giriyor olabilirsiniz. Bekarlar icin, yeni ve heyecan verici bir \n"
        + "iliski olasiligi oldukca yuksektir. Bu kisi, size enerji ve cosku katabilir.",
        
        "Is hayatinda yaratici bir donemdesiniz ve yeni projelere baslamak \n"
        + "icin ideal bir zamandasiniz. Bu kart, enerjinizin yuksek oldugunu ve \n"
        + "kariyerinizde cesur adimlar atmak icin ilham aldiginizi ggsterir. Is \n"
        + "fikirlerinizi uygulamaya gecirmek icin mukemmel bir donemdesiniz."
    },
    
    //65(Değnek İkilisi)
    {
        "Bu kart, planlama ve gelecekteki firsatlari degerlendirme surecini \n"
        + "isaret eder. Su anda elinizde guclu secenekler olabilir ve hangisinin \n"
        + "sizin icin daha iyi sonuclar doguracagini degerlendirme asamasinda olabilirsiniz. \n"
        + "Gelecekteki basarilar icin stratejik dusunme zamani. Risk almak zorunda \n"
        + "kalabilirsiniz, ancak dikkatli bir planlama ile buyuk kazanclar elde etmeniz mumkun.",
        
        "Ask hayatinizda bir karar verme surecindesiniz. Mevcut iliskinizin \n"
        + "gelecegi hakkinda dusunceleriniz olabilir veya yeni bir iliskiye \n"
        + "baslamak konusunda tereddut yasiyor olabilirsiniz. Bu kart, duygusal \n"
        + "olarak ileriye donuk planlar yapmaniz gerektigini isaret eder. \n"
        + "Bekarlar icin, olasi iki farklı secenek arasında kalabilirsiniz.",
        
        "ıs hayatinda kararlar ve stratejik planlar yapma zamani. \n"
        + "Hangi yone ilerleyeceginize karar vermeniz gerekebilir. Yeni bir projeye \n"
        + "baslamak ya da mevcut isinizi buyutmek gibi sesenekler onunuze gelebilir. \n"
        + "Bu surecte sabirli ve dikkatli olursaniz, basari sizin icin kacinilmazdir."
    },
    
    //66(Değnek Üçlüsü)
    {
        "Bu kart, ilerleme ve buyumeyi temsil eder. Daha onceki cabalarinizin \n"
        + "sonuclarini gormeye baslayabilir ve gelecekteki adimlarinizi planlamaya \n"
        + "devam edebilirsiniz. Bu kart, genis ufuklar ve yeni firsatlar anlamina gelir. \n"
        + "Hayatinizda onemli bir yolculuga cikabilir ya da yeni bir maceraya atilabilirsiniz.",
        
        "Ask hayatinizda yeni ufuklara yelken acma zamani. Mevcut iliskinizde \n"
        + "bir sonraki asamaya gecebilir veya partnerinizle birlikte buyuk planlar \n"
        + "yapabilirsiniz. Bekarlar icin, uzak mesafeli bir iliski ya da seyahat \n"
        + "sirasinda yeni biriyle tanisma olasiligi vardir. Bu kart, ask hayatinizda \n"
        + "hareket ve heyecani isaret eder.",
        
        "Is hayatinda, cabalarinizin sonuclarini gormeye basladiginiz bir \n"
        + "doneme girdiniz. Kariyerinizde buyume ve genisleme firsatlari karsiniza \n"
        + "cikabilir. Yeni projeler ya da uluslararasi baglantilar kurma \n"
        + "olasiligi vardir. Bu surecte cesur ve kararli olursaniz, buyuk \n"
        + "bacarilar elde edebilirsiniz."
    },
    
    //67(Değnek Dörtlüsü)
    {
        "Bu kart, kutlama, huzur ve istikrar anlamina gelir. Bu kart, \n"
        + "hayatinizdaki olumlu gelismeleri kutlamak icin bir firsat oldugunu \n"
        + "gosterir. Bir hedefe ulasmis veya bir donemi basariyla tamamlamis \n"
        + "olabilirsiniz. Aile, arkadaslar ve sevdiklerinizle birlikte huzur \n"
        + "dolu bir donemdesiniz.",
        
        "İliskilerde mutluluk ve kutlama zamani. Partnerinizle iliskinizde \n"
        + "bir donum noktasina ulasmis ve birlikte kutlama yapabilirsiniz. Bu kart, \n"
        + "evlilik, nisan ya da iliskiyi bir sonraki asamaya tasima gibi olaylari \n"
        + "simgeler. Beksrlar icin, ask hayatinizda ciddi ve guvenilir bir \n"
        + "iliskiye adim atma olasiligi yuksektir.",
        
        "Is hayatinda basarilarinizi kutlama zamani. Uzun suredir \n"
        + "uzerinde calistiginiz bir projeyi tamamlamis veya onemli bir hedefe \n"
        + "ulasmis olabilirsiniz. Bu kart, is arkadaslariniz ve cevrenizle birlikte \n"
        + "basarinizi kutlamaniz gerektigini gosterir. Ayni zamanda, kariyerinizde \n"
        + "guvenli ve saglam bir temele ulastiginizi da simgeler."
    },
    
    //68(Değnek Beşlisi)
    {
        "Bu kart, rekabet, catisma ve farkli gorusleri temsil eder. \n"
        + "Hayatinizda bir kaos ya da mucadele donemi olabilir, ancak bu zorluklar, \n"
        + "buyume ve gelisme icin bir firsattir. Catismalari cozmek ve uyum \n"
        + "saglamak icin esnek bir tutum sergilemeniz gerekebilir.",
        
        "İliskilerde anlasmazliklar ve kucuk çatismalar yasanabilir. \n"
        + "Partnerinizle iletisime odaklanarak bu sorunlarin ustesinden gelebilirsiniz. \n"
        + "Bekarlar icin, birden fazla kisinin ilgisiyle karsilasabilirsiniz, \n"
        + "bu da bir karar verme surecine neden olabilir.",
        
        "Is hayatinda rekabetci bir ortamdasiniz. Cevrenizdekilerle \n"
        + "catismalar ya da fikir ayriliklari yasanabilir, ancak bu surecte kararli \n"
        + "ve yapici bir tutum sergilerseniz, kendinizi kanitlayabilirsiniz. \n"
        + "Bu kart, zorluklarla basa cikmanin kariyeriniz icin faydali olacagini gosterir."
    },
    
    //69(Değnek Altılısı)
    {
        "Bu kart, zafer, taninma ve basariyi simgeler. Uzun suredir uzerinde \n"
        + "calistiginiz bir hedefe ulastiginiz veya baskalari tarafindan takdir \n"
        + "edildiginiz bir doneme isaret eder. Cabalarinizin karsiligini aliyorsunuz \n"
        + "ve hayatinizda pozitif bir donum noktasi yasaniyor. Bu basari, size \n"
        + "daha fazla motivasyon ve ozguven kazandirabilir.",
        
        "Ask hayatinizda mutluluk ve basariya ulastiginiz bir doneme girdiniz. \n"
        + "Partnerinizle iliskinizin olumlu yonde ilerledigini hissedebilir ve \n"
        + "sevginizin karsilikli olarak buyudugunu gorebilirsiniz. Bekarlar icin, \n"
        + "cevrenizde size hayran olan bir kisi fark edilebilir ve bu \n"
        + "kisiyle mutlu bir baslangic yapabilirsiniz.",
        
        "Is hayatinda taninma ve basari zamani. Cabalarinizin sonucunda \n"
        + "bir terfi, odul veya onemli bir proje tamamlanabilir. Bu kart, \n"
        + "liderlik vasiflarinizin fark edilmesi ve cevrenizden destek gormeniz \n"
        + "anlamina gelir. Is hayatinizda parlak bir donemdesiniz; bu \n"
        + "firsatlari iyi degerlendirin."
    },
    
    //70(Değnek Yedilisi)
    {
        "Bu kart, mucadele, savunma ve kendi durusunuzu koruma gerekliligini \n"
        + "isaret eder. Zorluklarla karsi karsiya olabilirsiniz, ancak kararli \n"
        + "bir sekilde hedeflerinizi savunmaniz gerekiyor. Baskalarinin sizin \n"
        + "uzerinizde baski kurmaya calısabilecegi bir donemde, kendi \n"
        + "inanslariniza sadik kalarak yol almaniz onemlidir.",
        
        "İliskinizde dis etkenlerden kaynaklanan baskilarla karsilasabilirsiniz. \n"
        + "Partnerinizle aranizda guclu bir bag kurarak bu baskilara karsi \n"
        + "dayanikli olmaniz gerekiyor. Bekarlar icin, duygularinizin ve \n"
        + "degerlerinizin test edildigi bir surec olabilir. Sabirli ve kararli olun.",
        
        "Is hayatinda rekabet ve baski ile karsilasabilirsiniz. \n"
        + "Cevrenizdekiler sizin basarilariniza goz dikebilir veya sizin pozisyonunuzu \n"
        + "sorgulayabilir. Bu surecte guclu bir durus sergileyerek basariya \n"
        + "ulasabilirsiniz. Kendinizi kanitlamak ve hak ettiginiz yeri korumak \n"
        + "icin caba sarf etmelisiniz."
    },
        
    //71(Değnek Sekizlisi)
    {
        "Bu kart, hiz, hareket ve ilerleme anlamina gelir. Hayatinizda \n"
        + "hizli gelismelerin yasanacagi bir doneme girdiginizi isaret eder. \n"
        + "Beklenmedik haberler alabilir veya ani kararlar vermek zorunda kalabilirsiniz. \n"
        + "Bu surecte enerjinizi iyi yonlendirerek firsatlari degerlendirmeniz onemlidir.",
        
        "Ask hayatinizda hizli ve heyecan verici gelismeler yasanabilir. \n"
        + "Partnerinizle iliskinizde bir anda yogun bir bag hissedebilir veya bir \n"
        + "sonraki asamaya gecebilirsiniz. Bekarlar icin, yeni bir kisiyle \n"
        + "tanisma veya ani bir duygusal bag kurma olasiligi vardir.",
        
        "Is hayatinda hizli bir ilerleme donemi. Beklediginiz projeler \n"
        + "hizla sonuclanabilir veya yeni firsatlar aniden karsınıza cikabilir. \n"
        + "Bu kart, harekete gecme ve hizli kararlar alma zamani oldugunu \n"
        + "gosterir. Enerjinizi odaklayarak bu firsatlari en iyi sekilde \n"
        + "degerlendirin."
    },
    
    //72(Değnek Dokuzlusu)
    {
        "Bu kart, direnc, dayaniklilik ve son bir cabanin gerektigi bir \n"
        + "donemi simgeler. Zorlu bir surecten gecmis olabilirsiniz, ancak pes \n"
        + "etmeden mucadeleye devam etmeniz onemlidir. Bu kart, bir hedefe cok \n"
        + "yaklastiginizi ve biraz daha dayanmaniz gerektigini isaret eder.",
        
        "İliskinizde gecmiste yasanan zorluklar sizi yipratmis olabilir, ancak \n"
        + "pes etmeden iliskiyi onarma cabalariniz devam ediyor. Partnerinizle \n"
        + "birlikte sorunlarin ustesinden gelmek icin son bir caba harcamaniz gerekebilir. \n"
        + "Bekarlar icin, gecmisteki hayal kirikliklarinin sizi engellemesine izin vermeden \n"
        + "yeni bir iliskiye acik olmaniz onemlidir.",
        
        "Is hayatinda yogun ve yorucu bir surecten geciyor olabilirsiniz. \n"
        + "Ancak bu kart, hedefinize cok yaklastiginizi ve biraz daha dayanmaniz gerektigini \n"
        + "gosterir. Cabalarinizin meyvelerini almak icin motivasyonunuzu \n"
        + "koruyun ve yilmadan devam edin."
    },
    
    //73(Değnek Onlusu)
    {
        "Bu kart, agir yukler, sorumluluklar ve bitisleri temsil eder. \n"
        + "Hayatinizda asiri yuklenmis hissedebilir veya cok fazla sorumluluk \n"
        + "aldiginiz bir donemde olabilirsiniz. Bu durum, sizi duygusal ve \n"
        + "fiziksel olarak yipratabilir; bu nedenle destek aramak ve yukunuzu \n"
        + "hafifletmek onemlidir.",
        
        "İliskinizde fazla sorumluluk almis ve bu durumun sizi yormus olabilecegi \n"
        + "bir donemde olabilirsiniz. Partnerinizle acik bir iletisim kurarak \n"
        + "bu yuku paylasmaniz gerekebilir. Bekarlar icin, duygusal gecmisinizin \n"
        + "yuku yeni iliskilere acik olmanizi zorlastirabilir; gecmisi geride \n"
        + "birakmaya calismalisiniz.",
        
        "Is hayatinda uzerinize cok fazla yuk almis olabilirsiniz. \n"
        + "Bu kart, asiri sorumluluklarin sizi yordugunu ve yardima ihtiyac \n"
        + "duydugunuzu gosterir. Daha verimli calismak ve yukunuzu hafifletmek \n"
        + "icin gorevlerinizi paylasmayi ogrenmeniz gerekebilir."
    },
    
    //74(Değnek Prensi)
    {
        "Bu kart, merak, macera ve yeni baslangiclari temsil eder. Bu \n"
        + "kart, hayatiniza yenilik katma, kesfetme ve yeni fikirlere acik olma \n"
        + "zamaninin geldigini isaret eder. Kendinizi yeni bir projeye, hobiye \n"
        + "veya yolculuga baslamak icin motive hissedebilirsiniz. Bu kart, ayni \n"
        + "zamanda genc ve enerjik bir ruh hali ile dunyayı kesfetme arzusunu simgeler. \n"
        + "Hayatinizda yaratici bir doneme girebilirsiniz; fikirlerinizi hayata \n"
        + "gecirmek icin cesaret ve tutkuya sahipsiniz.",
        
        "Ask hayatinizda macera dolu ve heyecan verici bir donemdesiniz. \n"
        + "Mevcut iliskinizde yeni bir seyler deneme ya da partnerinizle iliskinizi \n"
        + "canlandirma arzusu hissedebilirsiniz. Bekarlar icin, hayatiniza enerji \n"
        + "ve nese getirecek biriyle tanisma olasiligi yuksektir. Bu kisi, sizi yeni \n"
        + "seyler kesfetmeye tesvik eden biri olabilir.",
        
        "Is hayatinizda yenilik ve yaraticilik on planda. Yeni bir proje, \n"
        + "is firsati ya da ogrenme deneyimi sizi bekliyor olabilir. Bu kart, aynı \n"
        + "zamanda kariyerinizde yaratici dusuncelerinizle fark yaratabileceginizi \n"
        + "ve enerjinizle cevrenize ilham verebileceginizi gosterir. Ancak bu surecte \n"
        + "fikirlerinizi somut hale getirmek icin planli bir sekilde hareket etmelisiniz."
    },
    
    //75(Değnek Şövalyesi)
    {
        "Bu kart, cesaret, tutku ve hareketi simgeler. Bu kart, hayatinizda \n"
        + "enerjik ve heyecan verici bir doneme girdiginizi isaret eder. Su anda \n"
        + "hedeflerinize ulasmak icin cesur adimlar atmaya hazir hissediyorsunuz. \n"
        + "Risk alarak hayallerinize dogru ilerleyebilir, yeni maceralara atilabilirsiniz. \n"
        + "Ancak bu surecte sabirsizlik ve dikkatsizlikten kacinmaniz onemlidir. \n"
        + "Hizli dusunme ve ani kararlar, bazen beklenmedik sonuclar dogurabilir.",
        
        "Ask hayatinizda tutkulu ve heyecan verici bir donemdesiniz. Partnerinizle \n"
        + "iliskinizde enerjik bir bag hissedebilir ve birlikte yeni maceralara atilma \n"
        + "istegi duyabilirsiniz. Bekarlar icin, karizmatik ve dinamik bir kisiyle \n"
        + "karsilasma ihtimali vardir. Ancak iliskinizin hizla gelismesi, bazen \n"
        + "istikrarli bir temel olusturmayi zorlastirabilir, bu nedenle sabirli olmalisiniz.",
        
        "Is hayatinizda buyuk bir motivasyon ve enerjiyle hareket ediyorsunuz. \n"
        + "Yeni projelere baslamak icin hevesli olabilir ve cesur adimlar atabilirsiniz. \n"
        + "Ancak bu surecte aceleci davranmamaya ozen gostermelisiniz. Hedeflerinize \n"
        + "kararli bir sekilde ilerlerken, detaylara dikkat etmek ve sabirli olmak \n"
        + "basariyi garantileyecektir."
    },
    
    //76(Değnek Kraliçesi)
    {
        "Bu kart, karizma, guven ve ilham kaynagi olmayı temsil eder. \n"
        + "Bu kart, kendinize olan guveninizin arttigini ve cevrenize enerji ve \n"
        + "ilham yaydiginiz bir donemde oldugunuzu isaret eder. Yarativi \n"
        + "projelerde liderlik edebilir ve baskalarini cesaretlendirebilirsiniz. \n"
        + "Hayatinizda sicaklik, nese ve tutkunun on planda oldugu bir donemdesiniz.",
        
        "Ask hayatinizda tutkulu ve enerji dolu bir donemdesiniz. Partnerinizle \n"
        + "aranizdaki bagin daha da guclendigini ve iliskinizde daha fazla heyecan \n"
        + "oldugunu hissedebilirsiniz. Bekarlar icin, kendine guvenen ve cekici bir \n"
        + "kisiyle tanisma olasiligi vardir. Bu kisi, sizin icin ilham kaynagi olabilir.",
        
        "Is hayatinizda liderlik becerileriniz on planda. Projelerde baskalarina \n"
        + "ilham veriyor ve cevrenizdekilere guclu bir rehberlik sagliyorsunuz. Bu kart, \n"
        + "karizmaniz ve enerjinizle buyuk basarilar elde edeceginiz bir donemi isaret eder. \n"
        + "Yeni firsatlari degerlendirin ve cesur adimlar atmaktan cekinmeyin."
    },
    
    //77(Değnek Kralı)
    {
        "Bu kart, liderlik, guc ve kararliligi temsil eder. Hayatinizda \n"
        + "hedeflerinizi net bir sekilde belirlediginiz ve bu hedeflere ulasmak icin guclu \n"
        + "bir iradeyle ilerlediginiz bir donemdesiniz. Bu kart, hem kisisel hem de \n"
        + "profesyonel hayatinizda kararlilikla ilerlemenizi ve diger insanlara ilham \n"
        + "vermenizi isaret eder. Guclu bir liderlik donemi yasayabilirsiniz.",
        
        "İliskinizde guclu bir bag ve guven on plandadir. Partnerinizle birlikte \n"
        + "saglam ve istikrarli bir iliski kurmus olabilirsiniz. Bu kart, iliskinizin \n"
        + "sorumluluklar ve sevgiyle buyudugunu gosterir. Bekarlar icin, guclu, karizmatik \n"
        + "ve guvenilir bir partnerle tanisma olasiligi yuksektir. Bu kisi, \n"
        + "size hem ilham hem de destek saglayabilir.",
        
        "Is hayatinizda liderlik ve basari donemi. Cevrenizdeki \n"
        + "insanlara rehberlik ediyor ve kararliliginizla projeleri basariya \n"
        + "ulastiriyorsunuz. Bu kart, buyuk hedefler belirlediginizi ve bu hedeflere \n"
        + "ulasmak icin gereken enerjiyi ve stratejiyi uyguladiginizi gosterir. \n"
        + "Ayrica, bu donemde yeni firsatlar ve buyuk basarilar elde etme \n"
        + "sansiniz oldukca yuksektir."
    }
};
     
    
}
