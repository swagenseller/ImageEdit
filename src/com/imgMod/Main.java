package com.imgMod;
import java.util.*;

//import java.awt.Color;
//import java.awt.Image;
//import java.awt.Graphics2D;
import java.awt.image.BufferedImage; // importing buffered Image class
//import java.awt.image.DataBufferDouble;
import java.io.File; // importing File class
import java.io.IOException;  // imports IOException
//import java.net.URL;

//import javax.imageio.IIOImage;
import javax.imageio.ImageIO; // importing imageIO module
//import javax.imageio.ImageWriteParam;
//import javax.imageio.ImageWriter;
//import javax.imageio.plugins.jpeg.JPEGImageWriteParam;
//import javax.imageio.stream.ImageOutputStream;
//import javax.imageio.*;


public class Main {
    static BufferedImage pic;
    public static void main(String[] args) throws Exception, IOException {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Welcome, enter the filename of your image:");
        String picName = scan.next();
        BufferedImage imageName = readImage(picName);
    }

    ////////////////////////////////////////////////////////////////
    //  The following reads in an image with a matching file name //
    ////////////////////////////////////////////////////////////////

    public static BufferedImage readImage(String fname) throws Exception{

        BufferedImage image = ImageIO.read(new File(fname) );
        return(image);
    }
}
