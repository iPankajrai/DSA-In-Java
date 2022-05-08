package ClassAndObjectBasics;

public class ComplexNumbers {

	// Real and Imaginary data members are needed complext numbers     
    private int realNum;
    private int imgNum;
    
    // Constructor for complex number, restricting to give real and img part  
	public ComplexNumbers(int a, int b){
        this.realNum = a;
        this.imgNum = b;
    }
    
    // -------------------getter and setter ----------------START
    // To get real part of complex number
    public int getRealNum(){
        return this.realNum;
    }
    
    // To set real part of complex number
    public void setRealNum(int d){
        this.realNum = d;
    }
    
    // to get imaginary part complex number
    public int getImgNum(){
        return this.imgNum;
    }
    
    // to set imaginary part complex number
    public void setImgNum(int e){
    	this.imgNum = e;
    }
    // ------------------ getter and setter --------------------END
    
    
	// To print complex number
    public void print(){
        if(this.imgNum == 0){
            System.out.println(this.realNum);
        }else if(this.imgNum >0){
         	System.out.println(this.realNum + " + i" + this.imgNum);   
        }else if(this.imgNum <0){
            System.out.println(this.realNum + " - i" + this.imgNum); 
        }
    }
    
    // -------------------Plus ----------------START
    // To add two complex numbers (c1.plus(c2);)
    public void plus(ComplexNumbers c2){
        this.realNum = this.realNum + c2.realNum;
        this.imgNum = this.imgNum + c2.imgNum;
    }
    
    // [c3 = c1 + c2] return type will be of ComplexNumbers, type is static because we dont need to have new reference everytime this plus is called	
    public static ComplexNumbers plus(ComplexNumbers c1, ComplexNumbers c2){
        int newRealNum = c1.realNum + c2.realNum;
        int newImgNum = c1.imgNum + c2.imgNum;
        ComplexNumbers c3 = new ComplexNumbers(newRealNum, newImgNum);
        return c3;
    }
    // ------------------Plus -----------------------END
    
    // ------------------ Multiply ------------------ START
    // c1 = c1*c2 [ac-bd + (ad+bc)i]
    public void multiply(ComplexNumbers c2){
        int newReal = (this.realNum * c2.realNum) - (this.imgNum * c2.imgNum);
        int newImg = (this.realNum * c2.imgNum) + (this.imgNum * c2.realNum);
        this.realNum = newReal;
        this.imgNum = newImg;
    }
    
    // c3 = c1*c2
    public static ComplexNumbers multiply(ComplexNumbers c1, ComplexNumbers c2){
        int newReal = (c1.realNum * c2.realNum) - (c1.imgNum * c2.imgNum);
        int newImg = (c1.realNum * c2.imgNum) + (c1.imgNum * c2.realNum);
        ComplexNumbers c3 = new ComplexNumbers(newReal, newImg);
        return c3;
    }
    // ------------------Multiply -------------------- END
    
    // -----------------Conjugate --------------------START
    public void conjugate(){
        this.imgNum = -1 * this.imgNum;
    }
    // -----------------Conjugate --------------------END
	

}
