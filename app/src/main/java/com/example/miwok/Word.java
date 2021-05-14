package com.example.miwok;

public class Word {
    private String miWokTranslation;
    private   String defaultTranslation;
    private int imageResourceId=NO_IMAGE_PROVIDED;
    private int audioResourceId;
    public static final int NO_IMAGE_PROVIDED=-1;

   public Word(String mdefaultTranslation,String mmiWokTranslation,int maudioResourceId){
       miWokTranslation=mmiWokTranslation;
       defaultTranslation=mdefaultTranslation;
       audioResourceId=maudioResourceId;

   }
    public Word(String mdefaultTranslation,String mmiWokTranslation,int mimageResourceId,int maudioResourceId){
        miWokTranslation=mmiWokTranslation;
        defaultTranslation=mdefaultTranslation;
        imageResourceId=mimageResourceId;
        audioResourceId=maudioResourceId;

    }

  public String getMiWokTranslation(){

       return miWokTranslation;
   }
  public String getDefaultTranslation(){
       return defaultTranslation;
  }
      public int getImageResourceId(){
       return imageResourceId;
      }
      // RETURN WHETHER THERE IS A IMAGE OF THE WORD OR NOT
    boolean hasImage(){
       return imageResourceId!=NO_IMAGE_PROVIDED;
    }
    public int getAudioResourceId(){
       return audioResourceId;
    }

}
