class StatisticsReport
{
    protected string document;
    
    public String getData(Format f) {
      f.format(document);
    }
 }
 
 interface Format {
  format(String);
 }
 
 class Csv implements Format{
  format(document) {
    // logic
  }
 }
 class Word implements Format{
  format(document) {
    // logic
  }
 }
 class Html implements Format{
  format(document) {
    // logic
  }
 }
