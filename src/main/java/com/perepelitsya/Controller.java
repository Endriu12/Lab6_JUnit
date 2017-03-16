package com.perepelitsya;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class Controller {
    public static Boolean X;
    public static Boolean Y;

    /**Getters and setters*/
    public static Boolean isX(Boolean x) {
        return x;
    }
    public void setX(Boolean x) {
        X = x;
    }
    public static Boolean isY(Boolean y) {
        return y;
    }
    public void setY(Boolean y) {
        Y = y;
    }
    /***/

    String errorMessage = "!ERROR!\n Problem is caused by \"null\" variable";
    @FXML
    AnchorPane anchorPane;

    @FXML TextArea textArea;

    @FXML ImageView hint1ImageSmall;
    @FXML ImageView hint1ImageBig;
    @FXML ImageView hint2ImageSmall;
    @FXML ImageView hint2ImageBig;

    @FXML MenuButton xMenu;
    @FXML MenuButton yMenu;
    @FXML MenuItem xTrue;
    @FXML MenuItem xFalse;
    @FXML MenuItem xNaN;
    @FXML MenuItem yTrue;
    @FXML MenuItem yFalse;
    @FXML MenuItem yNaN;

    /** <hints' functions> */
    @FXML public void show2Image(){
        hint2ImageBig.setVisible(true);
        hint1ImageSmall.setOpacity(0.0);
        hint2ImageSmall.setOpacity(0.0);
    }
    @FXML public void hide2Image(){
        hint2ImageBig.setVisible(false);
        hint1ImageSmall.setOpacity(1.0);
        hint2ImageSmall.setOpacity(1.0);
    }
    @FXML public void show1Image(){
        hint1ImageBig.setVisible(true);
        hint1ImageSmall.setOpacity(0.0);
        hint2ImageSmall.setOpacity(0.0);
    }
    @FXML public void hide1Image(){
        hint1ImageBig.setVisible(false);
        hint1ImageSmall.setOpacity(1.0);
        hint2ImageSmall.setOpacity(1.0);
    }
    /** </hints' functions> */

    // Menu with X
    @FXML public void xTrueClick(){
        setX(true);
        xMenu.setText("True");
    }
    @FXML public void xFalseClick(){
        setX(false);
        xMenu.setText("False");
    }
    @FXML public void xNaNClick(){
        xMenu.setText("null");
        setX(null);
    }
    // Menu with Y
    @FXML public void yTrueClick(){
        setY(true);
        yMenu.setText("True");
    }
    @FXML public void yFalseClick(){
        setY(false);
        yMenu.setText("False");
    }
    @FXML public void yNaNClick(){
        yMenu.setText("null");
        setY(null);
    }

    /** <Button functions> */
    @FXML public void f0ButtonClick() {
        try {
            textArea.setText(X+"(Instant 0)"+Y+" = "+BoolCalculator.f0(X, Y));
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
        }
    }
    @FXML public void f1ButtonClick() {
        try {
            textArea.setText(X+"^"+Y+" = "+BoolCalculator.f1(X,Y));
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
        }
    }
    @FXML public void f2ButtonClick() {
        try {
            textArea.setText(X+"!→"+Y+" = "+BoolCalculator.f2(X,Y));
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
        }
    }
    @FXML public void f3ButtonClick() {
        try {
            textArea.setText(X+"(Transfer X)"+Y+" = "+BoolCalculator.f3(X,Y));
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
        }
    }
    @FXML public void f4ButtonClick() {
        try {
            textArea.setText(X+"!←"+Y+" = "+BoolCalculator.f4(X,Y));
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
        }
    }
    @FXML public void f5ButtonClick() {
        try {
            textArea.setText(X+"(Transfer Y)"+Y+" = "+BoolCalculator.f5(X,Y));
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
        }
    }
    @FXML public void f6ButtonClick() {
        try {
            textArea.setText(X+"(XOR)"+Y+" = "+BoolCalculator.f6(X,Y));
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
        }
    }
    @FXML public void f7ButtonClick() {
        try {
            textArea.setText(X+"∨"+Y+" = "+BoolCalculator.f7(X,Y));
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
        }
    }
    @FXML public void f8ButtonClick() {
        try {
            textArea.setText(X+"↓"+Y+" = "+BoolCalculator.f8(X,Y));
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
        }
    }
    @FXML public void f9ButtonClick() {
        try {
            textArea.setText(X+"↔"+Y+" = "+BoolCalculator.f9(X,Y));
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
        }
    }
    @FXML public void f10ButtonClick() {
        try {
            textArea.setText(X+"(Not Y)"+Y+" = "+BoolCalculator.f10(X,Y));
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
        }
    }
    @FXML public void f11ButtonClick() {
        try {
            textArea.setText(X+"←"+Y+" = "+BoolCalculator.f11(X,Y));
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
        }
    }
    @FXML public void f12ButtonClick() {
        try {
            textArea.setText(X+"(Not X)"+Y+" = "+BoolCalculator.f12(X,Y));
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
        }
    }
    @FXML public void f13ButtonClick() {
        try {
            textArea.setText(X+"→"+Y+" = "+BoolCalculator.f13(X,Y));
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
        }
    }
    @FXML public void f14ButtonClick() {
        try {
            textArea.setText(X+"↑"+Y+" = "+BoolCalculator.f14(X,Y));
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
        }
    }
    @FXML public void f15ButtonClick() {
        try {
            textArea.setText(X+"(Instant 1)"+Y+" = "+BoolCalculator.f15(X,Y));
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
        }
    }
    /** </Button functions> */

    /** FUN */
    boolean flag = false; //Anchorpane unvisibillity flag that is used in method "hideAnchorPane()"
    @FXML public void hideAnchorPane(){
        anchorPane.setVisible(flag);
        flag=!flag;
    }
    /***/
}
