import org.json.simple.JSONObject;

class Json
{
   public static void main(String[] args) 
   {
      JSONObject obj = new JSONObject();

      obj.put("email", "hectoralez@berkeley.edu");
      obj.put("github", "https://github.com/htotheg/code2040.git";

      StringWriter out = new StringWriter();
      obj.writeJSONString(out);
      
      String jsonText = out.toString();
      System.out.print(jsonText);
   }
}