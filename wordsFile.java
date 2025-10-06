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
 for (int i = toBeInverted.length() - 1; i >= 0; i--) {
            temp += toBeInverted.charAt(i);
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

 public String diagonalsBottomHalf(){
String ret = "";
for (int j=0;j<words.size();j++){
  for (int i=0;i<words.size();i++){
    if (i+j<40){
    ret = ret + words.get(i+j).charAt(i);
    }
  }
  ret = ret + "\n";
}
  return ret;
 }

 public String invertdiagonalsBottomHalf(){
String ret = "";
for (int j=0;j<words.size();j++){
  String temp="";
  for (int i=0;i<words.size();i++){
    if (i+j<40){
    temp = temp + words.get(i+j).charAt(i);
    }
  }
  ret = ret + invert(temp)+ "\n";
}
  return ret;
 }

public String diagonalsTopHalf(){
String ret = "";
for (int j=0;j<words.size();j++){
  for (int i=0;i<words.size();i++){
    if (i+j<40){
    ret = ret + words.get(i).charAt(i+j);
    }
  }
  ret = ret + "\n";
}
  return ret;
 }

  public String invertdiagonalsTopHalf(){
String ret = "";
for (int j=0;j<words.size();j++){
  String temp="";
  for (int i=0;i<words.size();i++){
    if (i+j<40){
    temp = temp + words.get(i).charAt(i+j);
    }
  }
  ret = ret + invert(temp)+ "\n";
}
  return ret;
 }
}