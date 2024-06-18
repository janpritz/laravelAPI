///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package POS;
//
//import java.io.FileNotFoundException;
//import javax.swing.JTable;
//import com.itextpdf.io.font.constants.StandardFonts;
//import com.itextpdf.kernel.font.PdfFont;
//import com.itextpdf.kernel.font.PdfFontFactory;
//import com.itextpdf.kernel.pdf.PdfDocument;
//import com.itextpdf.kernel.pdf.PdfWriter;
//import com.itextpdf.layout.Document;
//import com.itextpdf.layout.element.Paragraph;
//import com.itextpdf.layout.element.Table;
//import com.itextpdf.layout.element.Cell;
//
//import javax.swing.*;
//import java.io.File;
//import java.io.FileNotFoundException;
//
///**
// *
// * @author Momshie Langs
// */
//public class GeneratePDF {
//    private JTable table; // Assume you have your JTable initialized somewhere in your code
//
//    public GeneratePDF(JTable table) {
//        this.table = table;
//    }
//    
//    public void createPDF(String dest) throws FileNotFoundException {
//        PdfWriter writer = new PdfWriter(dest);
//        PdfDocument pdfDoc = new PdfDocument(writer);
//        Document document = new Document(pdfDoc);
//
//        try {
//            PdfFont font = PdfFontFactory.createFont(StandardFonts.HELVETICA);
//            document.add(new Paragraph("Table Data").setFont(font).setFontSize(18));
//
//            int columnCount = table.getColumnCount();
//            Table pdfTable = new Table(columnCount);
//
//            // Adding table headers
//            for (int i = 0; i < columnCount; i++) {
//                pdfTable.addHeaderCell(new Cell().add(new Paragraph(table.getColumnName(i)).setFont(font)));
//            }
//
//            // Adding table rows
//            for (int row = 0; row < table.getRowCount(); row++) {
//                for (int col = 0; col < columnCount; col++) {
//                    pdfTable.addCell(new Cell().add(new Paragraph(table.getValueAt(row, col).toString()).setFont(font)));
//                }
//            }
//
//            document.add(pdfTable);
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            document.close();
//        }
//    }
//}
