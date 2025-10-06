import java.util.ArrayList;
public class wordsFile {
  private ArrayList<String> words = new ArrayList<String>();

 public wordsFile(ArrayList<String> input){
  words=input;
 }
 
 public String Rows(){
  String ret = "";
  for (int i=0;i<words.size();i++)
  {
    ret= ret + words.get(i);
    ret= ret + "\n";
  }

  return ret;
 }

 public String checkLength(){
  String ret = "There is an error at line ";
  String realret="There are no length errors.";
  Boolean check=false;
  for (int i=0;i<words.size();i++)
  {
    if (!(words.get(i).length()==40)){
      if (check==false) realret="";
      check = true;
      realret= realret + ret + (i+1) + "." + "\n";
    }
  }
  return realret;
 }


 public void checkLengthStrict(){
  for (int i=0;i<words.size();i++)
  {
   System.out.println(words.get(i).length());
  }
 }

 
 public String invert(String toBeInverted){
  String temp="";
  for (int i=39;!(i==0);i=i-1){
    temp = temp + toBeInverted.charAt(i);
  }
  return temp;
 }

 public String invertRows(){
  String ret = "";
  for (int i=0;i<words.size();i++)
  {
    ret= ret + invert(words.get(i));
    ret= ret + "\n";
  }

  return ret;
 }
 

 public String Columns(){
  String ret = "";
  for (int i=0;i<words.size();i++){
    for (int j=0;j<words.size();j++){
  ret =  ret + words.get(j).charAt(i);
    }
    ret = ret+ "\n";
  }
  return ret;
 }

 public String invertColumns(){
  String ret = "";
  for (int i=0;i<words.size();i++){
    String temp="";
    for (int j=0;j<words.size();j++){
  temp =  temp + words.get(j).charAt(i);
    }
    ret = ret + invert(temp) + "\n";
  }
  return ret;
 }
}