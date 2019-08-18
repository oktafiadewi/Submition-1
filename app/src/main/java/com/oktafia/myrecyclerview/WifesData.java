package com.oktafia.myrecyclerview;

import java.util.ArrayList;

public class WifesData {
    public static String[][] data = new String[][]{
            {"Suami Kurang Perhatian", "Kurang perhatian menjadi penyebab yang paling sering membuat istri marah. Wanita punya kebutuhan lebih untuk selalu diperhatikan oleh pasangannya, tapi terkadang jarang mengungkapkan hal tersebut. Disaat seperti suami biasanya harus lebih peka dengan kondisi tersebut.", "https://tse2.mm.bing.net/th?id=OIP.lx-r0COoDUn4xSLXf8363AHaHa&pid=Api&P=0&w=300&h=300"},
            {"Cemburu Pada Suami", "Banyak hal yang bisa meyebabkan istri cemburu, salah satunya ketika istri mendapati suami sering membicarakan rekan kerja wanita atau sibuk dengan urusan sendiri. Cemburu selain bisa mengakibatkan konflik juga berbahaya bagi keutuhan rumah tangga bila dibiarkan berlanjut. Pada saat istri cemburu, ada baiknya suami memberi pengertian bahwa mereka mencintai istri dan memberikannya perhatian lebih. Hindari juga melakukan hal-hal yang membuat istri cemburu seperti yang disebutkan diawal pembahasan.", "https://tse4.mm.bing.net/th?id=OIP.VcDZv30sfoC_UpzUf23yIQHaEK&pid=Api&P=0&w=299&h=169"},
            {"Suami Terlalu Sibuk", "Suami terlalu sibuk dan kurang memperhatikan istri sudah pasti akan membuat istri marah dan merasa terabaikan. Jika Anda memang sibuk dengan pekerjaan, berilah pengertian pada istri Anda tapi jangan lupakan juga kebutuhannya. Tunjukkan pada istri apa yang menjadi penyebab kesibukan Anda, agar istri bisa memamahami kesibukan tersebut.", "https://tse1.mm.bing.net/th?id=OIP.IYC7ytjEzbRciewOOWOWBAHaD3&pid=Api&P=0&w=289&h=152"},
            {"Suami Kurang Romantis", "Sebetulnya sangat penting menjaga romantisme dalam kehidupan rumah tangga, terutama bila pernikahan sudah memasuki tahun kesekian, dan mulai kehilangan semangatnya diawal. Tidak sedikit istri yang mengeluhkan suami mereka kurang romantis, tidak seperti saat awal menjalani kehidupan pernikahan. Suami perlu menjaga romantisme tersebut, tapi tidak perlu berlebihan. Mengajak istri kencan bisa menjadi salah satunya.", "https://tse2.mm.bing.net/th?id=OIP.a02zEzfJgzaeRL1mSzK16QAAAA&pid=Api&P=0&w=165&h=153"},
            {"Suami Sering Keluar Rumah", "Suami yang jarang ada dirumah karena sering menghabiskan waktu libur dengan teman atau sering lembur dikantor akan membuat istri merasa diabaikan atau bahkan berpikir kalau suami tidak cinta lagi kepadanya. Bagi para suami, ingatlah bahwa Anda sudah memasuki kehidupan rumah tangga dan harus membagi waktu secara bijak. Jika Anda sering menghabiskan waktu diluar rumah tanpa istri, sebaiknya mulai kurangi kegiatan tersebut dari sekarang.", "https://themarriageandfamilyclinic.com/wp-content/uploads/2016/12/Angry-Wife.jpg"},
            {"Stress", "Stress juga mengakibatkan istri sering marah. Stress bisa dipicu oleh banyak hal, seperti beban rumah tangga, cape mengurus anak, dan sebagainya. Dalam kondisi seperti ini dukungan dan pengertian dari suami sangat diperlukan. Sebagai suami yang baik, Anda justru harus membantu istri meringankan beban tersebut. Mengajak istri bisa menjadi salah satu efektif menghilangkan stress.", "http://www.blogcdn.com/slideshows/images/slides/370/441/8/S3704418/slug/l/angry-young-woman-1.jpg"},
            {"Anak Rewel", "Anak yang sering rewel dan sulit diatur memang membuat pasangan menikah lelah secara emosional, terutama istri karena merasa tanggung jawab mengurus anak dibebankan sebagian besar kepadanya, terutama bila suami dirasa kurang membantu. Dalam kondisi seperti ini, suami juga perlu turun tangan dalam mendidik anak agar istri tidak merasa tertekan atau stress.", "https://media.siraplimau.com/wp-content/uploads/2018/04/marah-anak-2.jpg"},
            {"Masalah Keuangan", "Masalah keuangan memang bukan perkara mudah. Dibutuhkan pengertian dari masing-masing pihak. Untuk mengatasi istri yang serina marah karena masalah keuangan, seperti kurangnya penghasilan, suami perlu ekstra sabar dalam memberikan pengertian, bahkan meminta istri untuk bekerjasama menyelesaikan masalah tersebut. Bagaimanapun kehidupan rumah tangga dijalani oleh dua orang, bukan salah satu pihak saja.", "https://2.bp.blogspot.com/-RBFN7bRqSKc/Vp_46ZefU8I/AAAAAAAAB6Q/T3-UE5rZo84/w1200-h630-p-k-no-nu/Anger%2Bwife.jpg"},
            {"Kurang Hiburan", "Dengan banyaknya beban rumah tangga, seperti mengurus rumah dan mendidik sudah tentu akan membuat istri lelah dan kadangkala sering marah untuk melampiaskan kekesalan. Saat seperti ini ada baiknya suami mengajak istri untuk liburan sejenak melepaskan penat. Saat kondisi pikiran sudah tenang dan segar, hal tersebut tentu akan meningkatkan kondisi kesehatan fisik maupun batin Anda beserta istri.", "https://tse4.mm.bing.net/th?id=OIP.4MLo9IkGgGAK4h7MHcXwQQHaE7&pid=Api&P=0&w=237&h=158"},
            {"Kehamilan", "Penyebab yang satu ini dipicu oleh hormon. Dalam keadaan hamil tidak jarang istri merasa kesal dan ingin marah-marah tanpa sebab karena hormon estrogennya melunjak. Para suami tidak perlu khawatir dengan kondisi seperti ini, dengan memberikan perhatian yang cukup sudah sangat membantu meningkatkan kesehatan psikologis istri semasa hamil. Suami juga perlu bersabar menghadapi mood istri yang turun naik selama kehamilan.", "https://confidentman.net/wp-content/uploads/angry-woman-1024x683.jpg"},
    };
    public static ArrayList<Wife> getListData(){
        ArrayList<Wife> list = new ArrayList<>();
        for (String[] aData : data) {
            Wife wife = new Wife();
            wife.setName(aData[0]);
            wife.setFrom(aData[1]);
            wife.setPhoto(aData[2]);
            list.add(wife);
        }
        return list;
    }
}
