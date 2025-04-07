/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication74;


public class MajorArcana extends Kart {
    
    private static final String [] majorKartlar={"joker","Buyucu","Azize","Imporatorice","Imparator","Aziz","Asiklar","Savas Arabasi",
    "Guç","Ermis","Kader Carki","Adalet","ASilmis Adam","Olum","Denge","Seytan","Yıkılan Kule","Yildiz","Ay","Gunes","Mahkeme","Dunya"};
    
    @Override
    public String getKart(int numara) {
    return majorKartlar[numara];
    }

    
       
    public MajorArcana(){
        System.out.println("Major Kart cekildi:");
    }
    
      @Override
    public String getAnlamlar(int tercih, int KartNumara) {
     return anlamlar[tercih][KartNumara];
        }
    
    
    private static String[][] anlamlar={
    
   //0(Joker)
    {
    "Joker, yeni baslangiclar, macera ve cesareti temsil eder. \n" +
    "Bu kart, hayatinizda yeni bir yolculuga cikmak uzere oldugunuzu \n" +
    "gosterir. Bilinmezlige adim atmak sizi hem heyecanlandirabilir \n" +
    "hem de korkutabilir, ancak bu yolculuk, buyuk ogrenme deneyimleri \n" +
    "ve firsatlar sunabilir. Hayatinizda risk almaniz ve icgudulerinize \n" +
    "guvenmeniz gereken bir donemdesiniz.",
        
    "Ask hayatinizda spontane ve heyecan dolu bir donemdesiniz. Yeni \n" +
    "bir iliskiye adim atabilir veya mevcut iliskinizde alisilmisin disinda \n" +
    "deneyimlere acik olabilirsiniz. Bu kart, ozgurluk ve bireyselligin \n" +
    "onemini vurgular. Bekarlar icin, yeni ve heyecan verici bir kisiyle \n" +
    "tanisma olasiligi vardir. Ancak, acele kararlar almadan once ne \n" +
    "istediginizi netlestirmeniz onemlidir.",
        
    "Is hayatinizda cesur bir adim atarak yeni bir projeye veya \n" +
    "kariyer yoluna baslayabilirsiniz. Bu kart, risk almanin ve yaratici \n" +
    "dusunmenin odullendirilecegi bir donemi simgeler. Ancak, planlama \n" +
    "eksikligi sizi zor durumda birakabilir. Yeni bir girisim veya is \n" +
    "degisikligi icin dogru zaman olabilir, ancak detaylara dikkat \n" +
    "etmeyi ihmal etmeyin."
    },
    
    //1(Büyücü)
    {
    "Buyucu, potansiyel, yaraticilik ve irade gucunu simgeler. \n" +
    "Bu kart, hayatinizda tum kaynaklari dogru bir sekilde kullanarak \n" +
    "hedeflerinize ulasabileceginiz bir donemde oldugunuzu gosterir. Kendinize \n" +
    "inanarak ve yeteneklerinizi sergileyerek buyuk basarilar elde \n" +
    "edebilirsiniz. Bu, manifestasyon gucunuzun yuksek oldugu bir zaman dilimidir.",
        
    "Ask hayatinizda cekim ve iletisimim on planda oldugu bir donemdesiniz. \n" +
    "Partnerinizle duygusal ve zihinsel olarak guclu bir bag kurabilirsiniz. \n" +
    "Bekarlar icin, karizmatik ve etkileyici bir kisiyle tanisma olasiligi \n" +
    "yuksektir. Ancak, iliskide manipülasyon veya yaniltici davranislardan \n" +
    "kacinmaniz onemlidir",
        
    "Kariyerinizde yaratici fikirlerinizi hayata gecirmek ve basariya \n" +
    "ulasmak icin gereken tum yeteneklere sahipsiniz. Bu kart, dogru \n" +
    "kaynaklari ve araclari kullanarak buyuk projelere imza atabileceginizi \n" +
    "gosterir. Liderlik ve stratejik dusunme, is hayatinda sizi one \n" +
    "cikartacaktir. Ancak, enerjinizi dogru yonlendirdiginizden emin olun."
    },
    
    //2(Azize)
    {
    "Azize, icsel bilgelik, sezgi ve bilinmeyen sirlari simgeler. \n" +
    "Bu kart, kendinizi dinlemeniz ve ic sesinize guvenmeniz gereken \n" +
    "bir donemi isaret eder. Bilincaltinizdaki cevaplarsz ulasmak icin \n" +
    "daha derin bir anlayis gelistirebilirsiniz. Hayatinizda gizemli \n" +
    "olaylar ya da sirlar aciga cikabilir.",
        
    "Ask hayatinizda duygusal derinlik ve sezgiler on plandadir. \n" +
    "Partnerinizin gercek hislerini anlamak icin ic sesinize kulak vermelisiniz. \n" +
    "Bu kart, bir iliskinin gizli yonlerini veya sakli kalmis duygulari \n" +
    "ortaya cikarabilir. Bekarlar icin, bilinmeyen bir bagin veya mistik \n" +
    "bir cekimin ortaya cikabilecegi bir donemdir.",
        
    "Is hayatinizda sezgilerinizin size rehberlik edecegi bir \n" +
    "doneme giriyorsunuz. Kararlarinizi alirken mantik kadar icsel \n" +
    "hislerinizi de dinlemeniz onemli. Bu kart, sirlarin aciga cikabilecegini \n" +
    "ve daha fazla bilgiye ihtiyaciniz olabilecegini gosterir. Onemli \n" +
    "bir karar vermeden once detaylari gozden gecirin ve acele etmeyin."
    },
    
    //3(İmparatoriçe)
    {
    "Imparatorice, bolluk, dogurganlik ve yaratici enerjiyi temsil eder. \n" +
    "Hayatinizda uretkenligin ve buyumenin on planda oldugu bir doneme \n" +
    "isaret eder. Yeni projeler baslatmak, aile kurmak veya yaratici \n" +
    "fikirlerinizi hayata geçirmek icin mukemmel bir zamandir. Aynı zamanda, \n" +
    "doga ve cevreyle baglarinizi guclendirme arzusu hissedebilirsiniz.",
        
    "Ask hayatinizda duygusal guven ve baglilik on planda. Partnerinizle \n" +
    "iliskinizde sevgi dolu bir donem yasayabilir, birlikte guclu bir bag \n" +
    "kurabilirsiniz. Bu kart, ayni zamanda bir iliskinin buyume ve olgunlasma \n" +
    "evresine girdigini gosterebilir. Bekarlar icin, derin bir duygusal \n" +
    "bag kurabileceginiz bir kisiyle tanisma olasiligi vardir.",
        
    "Kariyerinizde uretkenlik ve basari donemi. Yaratici projelerde \n" +
    "buyuk ilerlemeler kaydedebilir ve emeklerinizin karsiligini \n" +
    "alabilirsiniz. Bu kart, ayni zamanda finansal kazanc ve \n" +
    "yatirimlarin meyve verdigi bir donemi temsil eder. Is yerinde \n" +
    "huzur ve is birligi on planda olacaktir."
    },
    
    //4(İmparator)
    {
    "Imparator, otorite, duzen ve kararliligi simgeler. Hayatinizda \n" +
    "disiplinli bir tutum sergileyerek buyuk basarilar elde edebilirsiniz. \n" +
    "Bu kart, liderlik becerilerinizin on planda oldugu bir donemi isaret eder. \n" +
    "Kurallar koymak ve hedeflerinize ulasmak icin stratejik bir \n" +
    "yaklasim benimsemelisiniz.",
        
    "Ask hayatinizda guven ve istikrar on plandadir. Partnerinizle \n" +
    "iliskinizde saglam bir temel olusturabilir, birlikte gelecege dair \n" +
    "planlar yapabilirsiniz. Ancak, iliskinizde fazla kontrolcu davranmamaya \n" +
    "ozen gostermelisiniz. Bekarlar icin, guclu ve guvenilir bir \n" +
    "partnerle tanisma olasiligi vardir.",
        
    "Is hayatinizda liderlik pozisyonuna gecebilir veya onemli \n" +
    "bir sorumluluk ustlenebilirsiniz. Bu kart, disiplin ve planlama ile \n" +
    "buyuk basarilar elde edeceginizi gosterir. Is yerinde otoritenizi \n" +
    "gostermek ve saygi kazanmak icin kararli bir durus sergileyin. \n" +
    "Ancak, esnek olmayi unutmamalisiniz."
    },
    
    //5(Aziz)
    {
    "Aziz, gelenekler, maneviyat ve bilgeligi simgeler. Bu kart, \n" +
    "hayatınızda bir rehberden veya ogretiye bagli kalarak ilerlemek \n" +
    "gerektigini isaret eder. Geleneksel degerler ve toplumsal kurallara \n" +
    "uyum saglamaniz gerekebilir. Manevi bir yolculuga cikmak veya icsel \n" +
    "bilgelik arayisi icine girmek isteyebilirsiniz.",
        
    "Ask hayatinizda baglilik ve sorumluluk on plandadir. Iliskinizde \n" +
    "guclu bir temele ve ortak degerlere dayali bir bag kurabilirsiniz. \n" +
    "Bu kart, evlilik ya da uzun vadeli bir iliski icin adim atma zamani \n" +
    "oldugunu gosterebilir. Bekarlar icin, cidi ve guvenilir bir \n" +
    "iliski arayisinda olan bir kisiyle tanisma olasiligi yuksektir.",
        
    "Is hayatinizda deneyimli bir mentor ya da rehberin destegini \n" +
    "alabilirsiniz. Bu kart, geleneksel yontemleri ve kurallari takip \n" +
    "ederek basariya ulasacagınızı gosterir. Egitim veya bilgi paylasimi \n" +
    "iceren bir proje uzerinde calisabilir ve bu surecten buyuk \n" +
    "kazanc elde edebilirsiniz."
    },
    
    //6(Aşıklar)
    {
    "Asiklar, secimler, iliskiler ve uyumu temsil eder. Hayatinizda \n" +
    "onemli bir karar verme surecine girebilir ve bu surecte kalbinizi \n" +
    "dinlemeniz gerekebilir. Ikili iliskilerde denge ve uyumu saglamak icin \n" +
    "acik iletisim onemlidir. Bu kart, hem romantik hem de kisisel \n" +
    "baglarinizi guclendirme zamaninin geldigini gosterir.",
        
    "Ask hayatinizda tutkulu ve derin bir bag kurma zamani. \n" +
    "Partnerinizle iliskinizde sevgi, uyum ve anlayis on planda olacaktir. \n" +
    "Bu kart, bir iliskinin derinlesmesi ya da yeni bir aska adim atma \n" +
    "olasiligini isaret eder. Bekarlar icin, hayatlarinda onemli bir \n" +
    "yer tutacak biriyle tanisma zamani olabilir.",
        
    "Is hayatinizda onemli bir secimle karsi karsiya kalabilirsiniz. \n" +
    "Bu kart, bir is birligi ya da ortaklik kurmanin kariyerinizde \n" +
    "olumlu bir etkisi olacagini gosterir. Ayrica, ekip calismalarinda uyum \n" +
    "ve is birligi sayesinde basariya ulasabilirsiniz. Ancak, kararlarinizi \n" +
    "alirken uzun vadeli etkilerini goz onunde bulundurmaniz onemlidir."
    },
    
    //7(Savaş Arabası)
    {
    "Savas Arabasi, zafer, irade gucu ve kontrolu simgeler. Hayatinizda \n" +
    "zorluklari asmak ve hedeflerinize ulasmak icin kararlilikla ilerledigimiz \n" +
    "bir donemi isaret eder. Bu kart, cabalarinizin karsiligini alacaginizi \n" +
    "ve disiplinli bir sekilde hareket ederek basariya ulasacaginizi gosterir. \n" +
    "Ayrica, icsel catismalarinizda dengeyi saglamaniz gerekebilir.",
        
    "Ask hayatinizda guclu bir bag ve ilerleme soz konusu. Partnerinizle \n" +
    "birlikte zorluklarin ustesinden gelebilir ve iliskinizi daha guclu bir \n" +
    "hale getirebilirsiniz. Bu kart, iliskinizde kontrol ve uyumu dengelemenin \n" +
    "onemli oldugunu hatirlatir. Bekarlar icin, guclu ve kararli bir kisiyle \n" +
    "tanisma olasiligi vardir. Ancak, duygusal derinligi yakalamak icin \n" +
    "aceleci davranmamak onemlidir.",
        
    "Is hayatinizda irade gucunuz ve kararliliginiz sayesinde basari \n" +
    "elde edeceginiz bir donemdesiniz. Zorluklarla karsilasasaniz bile, \n" +
    "disiplini elden birakmayarak tum engelleri asabilirsiniz. Bu kart, \n" +
    "liderlik becerilerinizi ve hedeflerinize ulasma yeteneginizi on \n" +
    "plana cikarir. Ancak, basariya giden yolda dengeli ve kontrollu \n" +
    "kalmaniz onemlidir."
    },
    
    //8(Güç)
    {
    "Guc karti, icsel dayaniklilik, cesaret ve sabri simgeler. \n" +
    "Bu kart, hayatinizdaki zorluklarla yuzlesirken icsel gucunuzu kullanmaniz \n" +
    "gerektigini isaret eder. Sakinlik ve sabirla hareket ederek, dis \n" +
    "dunyadaki problemleri cozebilir ve kendinizi daha guclu bir hale \n" +
    "getirebilirsiniz. Ayni zamanda, ofke veya korku gibi duygulari \n" +
    "kontrol etmeniz gerekebilir.",
        
    "Ask hayatinizda sabir ve anlayis on plandadir. Partnerinizle \n" +
    "iliskinizde guclu bir bag kurmak icin duygusal dayanikliliga ihtiyaciniz \n" +
    "olabilir. Bu kart, sevginizin zorluklar karsisinda dayanikliligini \n" +
    "gosterir. Bekarlar icin, karsilarina cikan bir kisiyle duygusal bir \n" +
    "bag kurmalari zaman alabilir, ancak bu iliski saglam bir temel \n" +
    "uzerinde gelisebilir.",
        
    "Is hayatinizda sabir ve kararlilikla hareket etmeniz gereken \n" +
    "bir doneme isaret eder. Gucunuzu gosterme ve zorluklarin ustesinden \n" +
    "gelme zamani. Bu kart, cesaretiniz ve kararliliginiz sayesinde basariya \n" +
    "ulasacaginizi simgeler. Ancak, sakinliginizi korumaniz ve aceleci \n" +
    "davranmaktan kacinmaniz onemlidir."
    },
    
    //9(Ermiş)
    {
    "Ermis, icsel arayis, yalnizlik ve bilgelik kartidir. Hayatinizda \n" +
    "bir duraklama ve kendinizi dinleme zamani geldigini gosterir. Bu kart, \n" +
    "dis dunyadan uzaklasip icsel bir yolculuga cikmayi, yasamin anlamini \n" +
    "sorgulamayi ve derin bir anlayis kazanmayi simgeler. Kendinize \n" +
    "donerek onemli cevaplara ulasabilirsiniz.",
        
    "Ask hayatinizda bir duraklama veya icsel bir degerlendirme \n" +
    "donemi olabilir. Partnerinizle iliskinizde derin dusunme ve anlam \n" +
    "arayisi on planda olabilir. Bu kart, iliskinizi daha iyi anlamak ve \n" +
    "guclendirmek icin zamana ihtiyaciniz oldugunu gosterebilir. Bekarlar \n" +
    "icin, kendi icsel yolculugunuzu tamamladiktan sonra bir iliskiye \n" +
    "hazir olabilirsiniz.",
        
    "Is hayatinizda kendi yolunuzu bulmaya ve icsel bir rehberlik \n" +
    "arayisina odaklanabilirsiniz. Bu kart, gecmis tecrübelerinizden \n" +
    "ders alarak gelecekteki hedeflerinizi belirlemeniz gerektigini gosterir. \n" +
    "Belki de kariyer degisikligi veya mevcut durumunuzu yeniden \n" +
    "degerlendirme zamani gelmistir. Sabirli olun ve aceleci kararlar almayin."
    },
    
    //10(Kader Çarkı)
    {
    "Kader Carki, degisim, donguler ve sans kartidir. Hayatinizda \n" +
    "buyuk bir donum noktasini yasayacaginiz ve beklenmedik olaylarin sizi \n" +
    "yeni bir yone goturebilecegini isaret eder. Bu kart, hem olumlu hem de \n" +
    "olumsuz degisimlere acik olmaniz gerektigini gosterir. Ancak, bu \n" +
    "degisimler uzun vadede sizin icin faydali olacaktir.",
        
    "Ask hayatinizda buyuk degisimler ve suprizler olabilir. \n" +
    "Partnerinizle iliiskinizde ani gelismeler veya yeni bir evreye gecis \n" +
    "soz konusu olabilir. Bekarlar icin, kaderin sizi yeni ve onemli \n" +
    "biriyle karsilastirabilecegi bir donemi isaret eder. Ancak, bu \n" +
    "degisimlere acik ve esnek olmaniz onemlidir.",
        
    "Is hayatinizda sans ve degisim donemi. Yeni firsatlar \n" +
    "karsiniza cikabilir veya beklenmedik bir gelisme kariyer yolunuzu \n" +
    "tamamen degistirebilir. Bu kart, firsatlari degerlendirme ve esneklik \n" +
    "gostermenin zamaninin geldigini gosterir. Hayatin dongulerine uyum \n" +
    "saglamak, basariya ulasmanizi kolaylastiracaktir."
    },
    
    //11(Adalet)
    {
    "Adalet karti, denge, durustluk ve sonuclari temsil eder. \n" +
    "Hayatinizda yaptiginiz secimlerin ve eylemlerin sonuclariyla yuzleseceginiz \n" +
    "bir donemi isaret eder. Bu kart, hem kisisel hem de evrensel adaletin \n" +
    "onemini vurgular. Kararlarinizi alirken mantikli ve adil bir \n" +
    "sekilde hareket etmeniz gerekebilir.",
        
    "Ask hayatinizda durustluk ve aciklik on plandadir. Partnerinizle \n" +
    "iliskinizde denge ve uyumu saglamak icin acik iletisim onemlidir. \n" +
    "Bu kart, iliskinizin gelecegiyle ilgili onemli bir karar alma \n" +
    "zamaninin oldugunu gosterebilir. Bekarlar icin, karsilasacaklari \n" +
    "kisinin durustluk ve guvenilirlik gibi degerlere sahip olmasi onemli olacaktir.",
        
    "Is hayatinizda adil ve mantikli bir yaklasim sergilemeniz gereken \n" +
    "bir doneme isaret eder. Bu kart, kariyerinizde gecmis cabalarinizin \n" +
    "karsiligini alacaginizi ve yaptiginiz secimlerin sonuclarinin \n" +
    "netlesecegini gosterir. Hukuki veya etik meselerde dikkatli olun \n" +
    "ve kararlarinizi titizlikle degerlendirin."
    },
    
    //12(Asılan Adam)
    {
    "Asilmis Adam, teslimiyet, perspektif degisimi ve sabir kartidir. \n" +
    "Hayatinizda bir tur duraklama veya geri cekilme donemine girdiginizi \n" +
    "gosterir. Bu, bir seyleri birakip yeni bir bakis acisi kazanmak icin \n" +
    "gereken zamani almaniz gereken bir zaman dilimidir. Beklediginiz \n" +
    "sonuclari elde etmek icin zamanin dogru olmasini beklemeniz gerekebilir.",
        
    "Ask hayatinizda sabir ve anlayis on planda. Mevcut iliskinizde veya \n" +
    "gecmisteki deneyimlerinizde bir tur derinlesme ya da yeniden degerlendirme \n" +
    "zamani olabilir. Bu kart, iliskinizden ne ogrendigine odaklanmanizi onerir. \n" +
    "Bekarlar icin, duygusal olarak olgunlasmak ve bir iliskiye \n" +
    "hazirlanmak icin zamaniniz olabilir.",
        
    "Is hayatinizda yeni firsatlar veya cozumler gormek icin \n" +
    "farkli bir acidan bakmaniz gerekebilir. Bu kart, kariyerinizde ilerlemek \n" +
    "icin geleneksel yollari bir kenara birakip daha esnek dusunmenizi onerir. \n" +
    "Isler yavas ilerliyor olabilir, ancak bu bekleyis, sonrasinda daha \n" +
    "saglam ve dogru bir yol bulmaniza yardimci olacaktir."
    },
    
    //13(Ölüm)
    {
    "Olum karti, donusum, yenilenme ve eskiyi geride birakmayi simgeler. \n" +
    "Hayatinizda buyuk bir degisim yasadiginiz ve eski aliskanliklari, dusunceleri \n" +
    "ya da yapilari birakmaniz gerektigini gosterir. Bu kart, bir donemin \n" +
    "sonu ve yeni bir baslangicin habercisidir. Korku ve direnc gosterilse de, \n" +
    "bu degisim sizi daha guclu ve olgun bir hale getirecektir.",
        
    "Ask hayatinizda onemli bir donusum yasabilir. Mevcut iliskinizde \n" +
    "ya da duygusal yasaminizda eski kaliplari birakma zamani gelebilir. \n" +
    "Bu kart, iliskinizin sona ermesi veya daha derin bir seviyeye tasinmasi \n" +
    "gibi buyuk degisikliklere isaret edebilir. Bekarlar icin, eski ask \n" +
    "kaliplarindan kurtulup yeni bir baslangic yapma zamani olabilir.",
        
    "Is hayatinizda eski projeleri ya da aliskanliklari geride birakmak \n" +
    "ve yeni bir doneme baslamak gerekecek. Bu kart, eski is iliskilerinden \n" +
    "ya da yontemlerden kurtulmanizi isaret eder. Yeniliklere acik olmaniz ve \n" +
    "donusum surecine uyum saglamaniz onemlidir. Degisim baslangicta zor \n" +
    "olabilir, ancak sonunda size buyuk firsatlar sunar."
    },
    
    //14(Denge)
    {
    "Denge, uyum ve sabir kartidir. Hayatinizda dengeyi saglama, \n" +
    "asiriliklardan kacinma ve orta yolu bulma zamani geldigini gosterir. \n" +
    "Icsel huzuru yakalamak icin dengeyi korumaniz gerekecek. Bu kart, duygusal, \n" +
    "zihinsel ve fiziksel dengenin onemli oldugunu vurgular. Sabirli ve \n" +
    "olculu bir yaklasim sergileyerek basarili olabilirsiniz.",
        
    "Ask hayatinizda denge ve uyumu saglamak icin sabirli olmalisiniz. \n" +
    "Iliskinizde asiriliklardan kacinarak orta yolu bulmaniz onemli olacaktir. \n" +
    "Partnerinizle uyum icinde olmak icin iletisimizi dengeleyin ve her iki \n" +
    "tarafin ihtiyaclarina dikkat edin. Bekarlar icin, bir iliskiye baslamadan \n" +
    "once kendi icsel dengenizi bulmaniz gerekecek.",
        
    "Is hayatinizda dengeyi saglamak icin zamana ihtiyaciniz olabilir. \n" +
    "Bu kart, sabirli ve olculu bir sekilde calisarak basariya ulasmanizi \n" +
    "gosterir. Islerinizi duzgun ve uyumlu bir sekilde duzenlemek, uzun vadede \n" +
    "faydali olacaktir. Ayrica, asiriliklardan kacinmak ve dogru zamanlamayi \n" +
    "beklemek is hayatinizda size buyuk fayda saglar."
    },
    
    //15(Şeytan)
    {
    "Seytan karti, bagimlilik, takintilar ve sinirlamalari simgeler. \n" +
    "Bu kart, hayatinizda sizi kisitlayan, bagimli oldugunuz veya olumsuz \n" +
    "etkileyen bir durumla yuzlesmeniz gerektigini isaret eder. Seytan, dissal \n" +
    "engellerden ziyade icsel sinirlamalara odaklanir. Kendi korkulariniz, \n" +
    "takintilariniz veya aliskanliklariniz sizi engelliyor olabilir. Bu kart, \n" +
    "ozgurlestirmek ve sinirlamalarinizdan kurtulmak icin cesaret gerektirir.",
        
    "Ask hayatinizda, takintili ve bagimli bir iliski icinde olabilirsiniz. \n" +
    "Partnerinizle iliskinizde sinirlayici ve zararli bir dinamik olabilir. Bu kart, \n" +
    "iliskiyi saglikli bir duzeye tasimak icin farkindalik yaratmaniz gerektigini \n" +
    "gosterir. Bekarlar icin, eski iliski kaliplarindan kurtulmak ve saglikli \n" +
    "bir bag kurmak icin icsel gucunuzu kullanmaniz gerekecek.",
        
    "Is hayatinizda, bagimliliklar veya kucuk aliskanliklar kariyerinizi \n" +
    "olumsuz etkileyebilir. Bu kart, sizi kisitlayan ya da sinirlayan bir durumla \n" +
    "yuzlesmeniz gerektigini isaret eder. Belki de isyerinde toksik bir ortamda \n" +
    "bulunuyor olabilirsiniz. Bu durumda, ozgurlestirmek icin adim atip ve sizi \n" +
    "engelleyen durumlari asmalisiniz."
    },
    
    //16(Kule)
    {
    "Kule karti, ani degisim, yikilma ve yeniden yapilanmayi simgeler. \n" +
    "Hayatinizda beklenmedik bir olay ya da durum, temellerinizi sarsabilir ve \n" +
    "sizi duygusal, zihinsel veya fiziksel olarak sok edebilir. Ancak, bu yikim, \n" +
    "daha saglam temellerin insa edilmesi icin bir firsat sunar. Kule, eski \n" +
    "yapilari, kaliplari ve inancilari yerle bir eder, boylece dogru olani \n" +
    "bulabilmeniz icin bir bosluk yaratir. Bu kart, zorluklari, sok edici \n" +
    "olaylari ve ani degisimleri simgeler; ancak sonunda daha saglam bir \n" +
    "temel kurmak icin bir firsat sunar.",
        
    "Ask hayatinizda buyuk bir sarsinti yasabilir. Mevcut iliskiniz \n" +
    "beklenmedik bir sekilde sona erebilir ya da buyuk bir krizle karsilasabilirsiniz. \n" +
    "Ancak bu kriz, iliskideki sagliksiz dinamiklerin ortadan kalkmasini ve \n" +
    "daha saglikli bir iliskiye olanak tanir. Eger bu donemi dogru sekilde \n" +
    "atlatabilirseniz, daha derin, daha guvenli ve gercekci bir iliskiye \n" +
    "adim atabilirsiniz. Bekarlar icin de, gecmisdeki iliskilerden veya \n" +
    "kaliplarindan kurtulmak, yeni bir baslangic yapmak anlamina gelebilir.",
        
    "Is hayatinizda ani degisimler veya beklenmedik krizler olabilir. \n" +
    "Kule karti, kariyerinizdeki saglam temellerin yerle bir olabilecegini, \n" +
    "eski projelerin ya da is iliskilerinin sona erebilecegini simgeler. Bu kart, \n" +
    "bir seylerin son bulmasiyla birlikte, yeni firsatlarin dogacagina isaret eder. \n" +
    "Is yerinizde buyuk degisiklikler olabilir, ancak bu degisimlerin sonunda daha guclu ve \n" +
    "basarili bir pozisyonda olabilirsiniz. Eski dusunce ve calisma yontemlerinden \n" +
    "kurtulup daha yenilikci ve dogru bir yol izlemeye baslayabilirsiniz."
    },
    
    //17(Yıldız)
    {
    "Yildiz karti, umut, iyilesme ve ilhami simgeler. Hayatinizda taze \n" +
    "bir baslangic yapabilir ve gelecege dair umutlarinizi yeniden canlandirabilirsiniz. \n" +
    "Bu kart, zorluklardan sonra bir iyilesme donemi oldugunu gosterir. \n" +
    "Icsel baris ve guven arayisinizda basarili olabilirsiniz. \n" +
    "Duygusal ve manevi acidan sifalanma zamanidir.",
        
    "Ask hayatinizda umut dolu bir donemdesiniz. Mevcut iliskinizde \n" +
    "duygusal iyilesme ve sifalanma olabilir. Partnerinizle daha derin \n" +
    "bir bag kurma, guveni pekistirme ve romantizmi canlandirma zamani gelmistir. \n" +
    "Bekarlar icin, hayatlarinda cok umut verici bir ask firsati dogabilir. \n" +
    "Bu kart, kalbinizi acarak yeni bir aska adim atmanizi isaret eder.",
        
    "Kariyerinizde, zorluklardan sonra taze bir baslangic yapabileceginiz \n" +
    "bir donemdesiniz. Bu kart, is hayatinizda basari ve ilham getirecek yeni \n" +
    "firsatlar sunar. Içsel huzuru bulmaniz ve yeniliklere acik olmaniz \n" +
    "gerektigini gosterir. Gecmisdeki hatalarinizdan ders alarak, simdi daha \n" +
    "saglam bir temele dayali bir kariyer insa edebilirsiniz."
    },
    
    //18(Ay)
    {
    "Ay karti, sezgi, gizem ve bilincaltini simgeler. Hayatinizda \n" +
    "her seyin gorundugu gibi olmadigini gosterir. Belirsizlik, kafa karisikligi \n" +
    "ve gizemli durumlar on plandadir. Bu kart, duygusal olarak karisik ve \n" +
    "bulanik bir donem oldugunu gosterir. Sezgilerinize guvenmek ve \n" +
    "daha dikkatli olmak gerekecek",
        
    "Ask hayatinizda belirsizlik ve kafa karisikligi olabilir. Partnerinizle \n" +
    "iliskinizde tam olarak ne oldugunu anlamayabilir ya da gizli duygularla \n" +
    "karsilasabilirsiniz. Bu kart, duygusal karisikliklar ve yaniltici \n" +
    "durumlarla basa cikmaniz gerektigini isaret eder. Bekarlar icin, bir \n" +
    "iliskeye baslamak icin daha fazla netlik elde etmeniz gerekebilir.",
        
    "Is hayatinizda belirsizlik ve gizli durumlarla karsilasabilirsiniz. \n" +
    "Bu kart, is yerindeki bazi seylerin ortbas edildigini veya karmasik bir hal \n" +
    "aldigini isaret eder. Karar alirken sezgilerinizi dinlemeniz ve dikkatli olmaniz \n" +
    "onemlidir. Gizli bilgiler veya yanlis anlamalar olabilir, \n" +
    "bu yuzden dikkatli bir sekilde ilerleyin."
    },
    
    //19(Güneş)
    {
    "Gunes karti, basari, mutluluk, guven ve aciklik kartidir. \n" +
    "Hayatinizda aydinlik bir donem basladigini ve basariya dogru ilerlediginizi \n" +
    "simgeler. Zorluklar geride kalmis ve simdi huzur, nese ve basari zamani. \n" +
    "Bu kart, tum engellerin asilidini ve sansin sizinle oldugunu gosterir.",
        
    "Ask hayatinizda buyuk bir nese ve mutluluk donemi basliyor. Mevcut iliskinizde, \n" +
    "samimi iletisim ve birbirinize duydugunuz guven artacak. Bu kart, iliskinizde \n" +
    "olumlu bir degisim, taze bir baslangic ve guclu bir bag kurmanizi isaret eder. \n" +
    "Bekarlar icin, ask hayatinizda heyecan verici bir gelisme olabilir. Yeni bir \n" +
    "ilisikinin baslangici, mutlulugunuzu pekistirebilir.",
        
    "Is hayatinizda basari ve parlak bir donemdesiniz. Calismalarinizin \n" +
    "karsiligini alacak ve emeklerinizin odullerini toplayacaksiniz. Bu kart, \n" +
    "kariyerinizde önemli bir ilerleme veya taninma anlamina gelir. Is dunyasinda \n" +
    "parlak bir basari sizi bekliyor. Ayrica, isyerindeki iliskilerinizde \n" +
    "aciklik ve guven on planda olacak"
    },
    
    //20(Mahkeme)
    {
    "Mahkeme karti, uyanis, kendini sorgulama ve yeni bir baslangic kartidir. \n" +
    "Hayatinizda onemli bir donum noktasina gelmissinizdir. Gecmisdeki eylemlerinizin \n" +
    "ve kararlarinizin sonuclariyla yuzleseceksiniz. Bu kart, icsel bir \n" +
    "uyanisa isaret eder ve sizi dogru yolda ilerlemeye tesvik eder. \n" +
    "Kendinizi yeniden kesfetme zamani gelmistir.",
        
    "Ask hayatinizda gecmisdeki iliskilerden dersler alarak gelecege \n" +
    "dogru onemli bir adim atabilirsiniz. Bu kart, eski kaliplardan \n" +
    "kurtulup daha saglikli bir iliski kurmaniza yardimci olur. Partnerinizle \n" +
    "gecmisdeki hatalari, yanlis anlamalari gozden gecirebilir ve iliskinizde \n" +
    "yeni bir baslangic yapabilirsiniz. Bekarlar icin, gecmisdeki \n" +
    "iliskilerinden ders alarak dogru bir iliski kurma zamani gelmistir.",
        
    "Is hayatinizda bir uyanis ve yenilenme donemi basliyor. \n" +
    "Gecmisdeki eylemlerinizin, kararlarinizin sonuclari simdi yuzunuze \n" +
    "cikacak ve bunlarla yüzleseceksiniz. Bu kart, is hayatinizda onemli \n" +
    "bir donum noktasini, degisim ve yeni firsatlari isaret eder. Gecmisde \n" +
    "yaptiginiz hatalardan ders alarak kariyerinize yeni bir yon verebilirsiniz."
    },
    
    //21(Dünya)
    {
    "Dunya karti, tamamlanma, butunluk ve basari kartidir. Hayatinizda  \n" +
    "bir dongu sona eriyor ve buyuk bir basari elde ediyorsunuz. Bu kart,  \n" +
    "tum cabalarinizin ve calismalarinizin sonucunun geldigini, bir yolculugun  \n" +
    "tamamlandigini ve yeni baslangiclar icin hazirliginizi gosterir.  \n" +
    "Artik yeni bir asamaya gecmeye hazirsiniz.",
        
    "Ask hayatinizda buyuk bir basari, tatmin ve mutluluk donemi.  \n" +
    "Mevcut iliskinizde olgunlasmis ve butunlesmis bir bag kurmussunuz.  \n" +
    "Birlikte buyuk bir yolculuga cikabilir ve iliskinizi yeni bir asamaya  \n" +
    "tasiyabilirsiniz. Bekarlar icin, kalbinizin ve hayatinizin tamamlanacagi bir  \n" +
    "iliskiye baslama zamanidir. Bu kart, ask hayatinizda huzur ve dengeyi simgeler.",
        
    "Is hayatinizda basari ve tatmin donemi. Tum cabalarinizin  \n" +
    "karsiligini alacak ve kariyerinizde zirveye ulasacaksiniz. Bu kart,  \n" +
    "uzun suredir pesinden gittiginiz bir hedefe ulasmanizi ve bu basariyla  \n" +
    "birlikte is hayatinizda dengeli ve tatmin edici bir durum yaratmanizi simgeler.  \n" +
    "Ayrica, yeni projeler icin firsatlar da ortaya cikabilir."
    }
};
    
}
