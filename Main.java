import java.util.ArrayList;
public class Main
{ 
    public static void main(String[] args)
{
    ArrayList<String> words = new ArrayList<String>();
    words.add("DUTQSFCHMLXASLIRERGTOPGCKHUKPITFIGCWYLPD");
    words.add("NUKGMBCZYKELWUDPEBFYOUMLTKGDFVJKUUSLWPLT");
    words.add("ZCLDWJYXLWJPYMCLCAOYSZGEQXSCUDRYNWYGFYVI");
    words.add("GSALMONRCJIEBAWUTUXELSQXHSEQIPFAOGBPNNSV");
    words.add("GQXSAYSGEYFCOADLLDEFECTOROZROJONPQZFLEXQ");
    words.add("VHMOGHARBDDARZEWTIOWBTZASIXZNSKZUDWGYYUF");
    words.add("QVJFZBARDUDCYKQTGGAVQRESTDPFENIMRACJTROJ");
    words.add("CJENLOTNCGTAQVDLMNVPBBETEUTAPQAXICUNQKDV");
    words.add("TSUPODHIISCGMTVUXLPJZDODNEOREEWMJYACTINA");
    words.add("GEUBZUYKAHCAMCAMZBYYPHFBRXHBUHVCMZIGWPOR");
    words.add("EJJTKLELZBEKNZAHRYZTFXSJAEHAVSCIVNRMOGQL");
    words.add("QKYGETBJYEGMPNXLRRSFIAYSGULUZTSHIVESWWQT");
    words.add("EYYNPUDEVQMWDPUCFIZHWZFCODTTSROMQDALRADT");
    words.add("CUPZTGTRYJGRVICRBOMGUEAKRKWICOEKZVFTHXXS");
    words.add("OWGKAANXPHATZPHWMCCAJYXRYDIEUHSSWYSXVCEW");
    words.add("WTHADQLWXKSJWOZQTNWSNIEBQLORRNZNZDQGBBIT");
    words.add("EJJTMSSEUNTCBJNUGHHIECOPRAJRSYNCIFEVDHYZ");
    words.add("DYOWWSRFTDISZRFFIHYKPBAIARIJIDVKFRMNYOQZ");
    words.add("BHVTURGTWPETSKNTDFBVWGKZJAXRRJVYCELYQKAH");
    words.add("PGFBNFITOYRKMPBNFGMSEIKCGPSNYDIDRCTAPUEI");
    words.add("RTNAOGJLUQXOOOZCJXNOAIGHXIRCRMJHINDWQZRH");
    words.add("ACQBSRFQUJZPENQLAISBZGHYOMQDCUPOMPEYNMPN");
    words.add("GRGLMXCROQLXXCYVMVPVGTTLYYGRXLIQSOLGCYLO");
    words.add("GHSFIZTOIQOAWENHCMGQHLIMCCVDJLKAOKVVGXOX");
    words.add("EMKJRYKNCZIHTAFGIZKTUJBPJATZDEYANXWSAIJI");
    words.add("PJVGCQNFLVZHSUAEPMPSHMTCNZZXVBGVZQENMMQW");
    words.add("OPBKFNLILNTRXWXNTTUQCGXMJWQKOXHCDLGZAIHI");
    words.add("ELFVANMXEJTVCSZCHJEJOKKDWRUZPGSKPSOFLZFK");
    words.add("KVNITCRPVFDOOERGMRXPKSBTBXEHXBVPAQZGDWFA");
    words.add("TENLLRWFPAAFQPNZCSLTQHCJKYIVITAHRMQNKZFC");
    words.add("EQRSEDRXTCDQMEWEGHAUHGCIRLGOQYHNUNORBZSV");
    words.add("UZJYKPTGUHCOITVHGDEOIWYEWXLFVTKTJKNURBIE");
    words.add("ROOINBGCWYXCIHSJJNFCZVLFYNVAJZBCEIRCAYFE");
    words.add("ZXQTFAXJICDDYANVBQEXLIPYKAQVBQEQPGRTSWCO");
    words.add("EOMNDBBCGSAYRGTKNJWZFCWRTYUKQZYVUYOBXUVX");
    words.add("OGXSJARDVFKLSTLMVXEEAZRSDBCQCIKNWRPASJJL");
    words.add("QGXFKCECAGAADDOOJIDGWTFATWUCLIDRASCSISDJ");
    words.add("IGNZNZJYNUTFZAAGILXHHGBHLZTBPYRNQEZWYBUU");
    words.add("YMWJZOOJNDRDGYQKADAHEKVYRWDGCLGBAINFHLBV");
    words.add("WAWYHJCEPKTMXAGKRIROWAACBJCUIEJDNAVODROC");
 
    wordsFile test = new wordsFile(words);

    System.out.print("All Rows Forward");
    System.out.println("\n");
    System.out.println(test.Rows());
    System.out.println("\n");
    System.out.print("All Rows Backward");
    System.out.println("\n");
    System.out.println(test.invertRows());
 
  System.out.print ("\n");
  System.out.print("All Columns Forward");
  System.out.println("\n");
  System.out.println(test.Columns());
  System.out.println("\n");
  System.out.print("All Columns Backward");
  System.out.println("\n");
  System.out.println(test.invertColumns());

  System.out.print ("\n");
  System.out.print("Diagonals BottomHalf Forward");
  System.out.println("\n");
  System.out.println(test.diagonalsBottomHalf());System.out.print ("\n");
  System.out.print("Diagonals BottomHalf Backward");
  System.out.println("\n");
  System.out.println(test.invertdiagonalsBottomHalf());
  System.out.print("Diagonals TopHalf Forward");
  System.out.println("\n");
  System.out.println(test.diagonalsTopHalf());System.out.print ("\n");
  System.out.print("Diagonals TopHalf Backward");
  System.out.println("\n");
  System.out.println(test.invertdiagonalsTopHalf());

}
}