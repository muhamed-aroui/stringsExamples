
/**
 * Write a description of Part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part2 {
    public String findSimpleGene(String dna,String startCodon,String stopCodon){
        //start codon is "ATG"
        //stop condon is "TAA"
        String result="";
        if(Character.isUpperCase(dna.charAt(0))==false){startCodon=startCodon.toLowerCase();
        stopCodon=stopCodon.toLowerCase();}
        int startIndex = dna.indexOf(startCodon);
        if (startIndex == -1){return "";}
        int stopIndex = dna.indexOf(stopCodon,startIndex+3);
        if (stopIndex ==-1){return"";}
        if((stopIndex - startIndex +3)%3==0){result =dna.substring(startIndex,stopIndex+3);}
        return result;
    }
    void testSimpleGene(){
        //String with ATG,TAA and the substring between them is multiple of 3
    String dna ="AATGGTACAGTCGTATGCTACGTTGTAAGTGTGTG";
    System.out.printf("Dna starnd is %s\n",dna);
    String gene= findSimpleGene(dna,"ATG","TAA");
    System.out.printf("Gene is %s\n\n",gene);
    //String with only TAA
    dna = "AGCTCACTGCTGCGTGCTGGCTAA";
     System.out.printf("Dna starnd is %s\n",dna);
    gene= findSimpleGene(dna,"ATG","TAA");
    System.out.printf("Gene is %s\n\n",gene);
    //String with only ATG
    dna = "AGTTACGCTGCATGCATGCATGCTA";
    System.out.printf("Dna starnd is %s\n",dna);
    gene= findSimpleGene(dna,"ATG","TAA");
    System.out.printf("Gene is %s\n\n",gene);
    //String with no ATG and TAA
    dna = "AGCGAGCACAGTCCTCTCGCTGCGCTGCTGCG";
    System.out.printf("Dna starnd is %s\n",dna);
    gene= findSimpleGene(dna,"ATG","TAA");
    System.out.printf("Gene is %s%n\n",gene);
    //String  with ATG, TAA but the substring between them is not a multiple of 3
    dna ="ATGCGTACGTTCACGTTGTACGTTAAGTCG";
    System.out.printf("Dna starnd is %s\n",dna);
    gene= findSimpleGene(dna,"ATG","TAA");
    System.out.printf("Gene is %s\n%n",gene);
    //String with ATG,TAA and the substring between them is multiple of 3
     dna ="AATGGTACAGTCGTATGCTACGTTGTAAGTGTGTG";
     dna=dna.toLowerCase();
     //dna= "atggtctaa";
    System.out.printf("Dna starnd is %s\n",dna);
     gene= findSimpleGene(dna,"ATG","TAA");
    System.out.printf("Gene is %s\n\n",gene);
    
}

}
