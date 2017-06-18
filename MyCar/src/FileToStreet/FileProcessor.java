/*
This is the class to process the file and generate the array of StreetSections.
 */
package FileToStreet;

import Street.*;
import java.util.ArrayList;
import Street.StreetSection;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileProcessor 
{
    private ArrayList<StreetSection> Road = new ArrayList<StreetSection>();
    
    public ArrayList<StreetSection> process(String pFile)
    {
        String FileContent = "";
        BufferedReader br = null;
        FileReader fr = null;

        try {

                fr = new FileReader(pFile);
                br = new BufferedReader(fr);

                String sCurrentLine;

                br = new BufferedReader(new FileReader(pFile));

                while ((sCurrentLine = br.readLine()) != null) {
                    FileContent += sCurrentLine;
//                        System.out.println(sCurrentLine);
                }

        } catch (IOException e) {
        } finally {

                try {

                        if (br != null)
                                br.close();

                        if (fr != null)
                                fr.close();

                } catch (IOException ex) {
                }    
                
        }
        
        analyzeString(FileContent);
        return Road;
    }
    
    private void analyzeString(String pContent)
    {
        SectionsFactory Sections = new  SectionsFactory();
        int MaxVelocity = 0;
        int MinVelocity = 0;
        boolean Nigth = false;
        boolean Morning = true;
        boolean Rain = false;
        
        int m=0;
        for(int i=0;i<pContent.length();i++){
            if(null != pContent.substring(m, i+1))
//            System.out.println(pContent.substring(m,i+1));
            switch (pContent.substring(m, i+1)) {
                case ".":{
                    Road.add(Sections.getSection("HundredMeters", MaxVelocity, MinVelocity, Nigth, Morning, Rain));
                        break;
                    }
                case "T":{
                    Road.add(Sections.getSection("Intersection", MaxVelocity, MinVelocity, Nigth, Morning, Rain));
                        break;
                    }
                case "t":{
                   Road.add(Sections.getSection("FourCorners", MaxVelocity, MinVelocity, Nigth, Morning, Rain));
                        break;
                    }
                case "D":
                    Morning = true;
                    Nigth =false;
                    break;
                case "N":
                    Nigth = true;
                    Morning =false;
                    break;
                case "L":
                    Rain = true;
                    break;
                case "F":{
                    Road.add(Sections.getSection("Final", MaxVelocity, MinVelocity, Nigth, Morning, Rain));
                        break;
                    }
                case "m":{
                    String entero = "0";
                    m++;
                    i++;
                    while(!".".equals(pContent.substring(i, m+1)) && !".".equals(pContent.substring(i, m+1))
                            && !"T".equals(pContent.substring(i, m+1)) && !"t".equals(pContent.substring(i, m+1))
                            && !"M".equals(pContent.substring(i, m+1)) && !"D".equals(pContent.substring(i, m+1))
                            && !"N".equals(pContent.substring(i, m+1)) && !"L".equals(pContent.substring(i, m+1))
                            && !"F".equals(pContent.substring(i, m+1)) && !"m".equals(pContent.substring(i, m+1))
                            && pContent.substring(i, m+1) != null)
                    {
//                        System.out.println(i);
//                        System.out.println(m);
                        
                        entero += pContent.substring(i,m+1);
                        i++;
                        m++;
                    }       
                    int r = Integer.parseInt(entero);
                    m--;
                    i--;
                    MinVelocity = r;
                        break;
                    }
                case "M":{
                    String entero = "0";
                    m++;
                    i++;
                    while(!".".equals(pContent.substring(i, m+1)) && !".".equals(pContent.substring(i, m+1))
                            && !"T".equals(pContent.substring(i, m+1)) && !"t".equals(pContent.substring(i, m+1))
                            && !"M".equals(pContent.substring(i, m+1)) && !"D".equals(pContent.substring(i, m+1))
                            && !"N".equals(pContent.substring(i, m+1)) && !"L".equals(pContent.substring(i, m+1))
                            && !"F".equals(pContent.substring(i, m+1)) && !"m".equals(pContent.substring(i, m+1))
                            && pContent.substring(i, m+1) != null)
                    {
//                        System.out.println(i);
//                        System.out.println(m);
                        
                        entero += pContent.substring(i,m+1);
                        i++;
                        m++;
                    }       
                    int r = Integer.parseInt(entero);
                    m--;
                    i--;
                    MaxVelocity = r;
                    break;
                    }
                default:
                    break;
            }
        m++;
        }
        System.out.println(Road.toString());
//        StraightLine tmp = (StraightLine)Road.get(0);
//        System.out.println(tmp.getMetros());
    }
      
}

