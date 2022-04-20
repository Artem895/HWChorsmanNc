package ChorsmanHomeWork.ChHW3.Ch9.progprojects;

import javafx.scene.layout.Pane;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

public class ChessPice {
    private String name="ChessPice";
    private String color;
    private int x;
    private int y;
    double xas;
    double yas;
    ArrayList<String> canmove;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setposition(String str){
        char[] pos=str.toCharArray();
        this.setX(pos[0]-97);
        this.setY(pos[1]-48);
        System.out.println(pos[0]+"-x "+pos[1]+"-y");
    }
    public ArrayList<String> canMoveTo(){
        ArrayList<String> move=new ArrayList<>();
        switch (this.getName()){
            case "King":{
                if(this.getX()==0){
                    if(this.getY()==1){
                        move.add(String.format("%c %d",((char)(this.getX()+97+1)),this.getY()));
                        move.add(String.format("%c %d",((char)(this.getX()+97)),this.getY()+1));
                        move.add(String.format("%c %d",((char)(this.getX()+97+1)),this.getY()+1));
                    }
                    else if(this.getY()==8){
                        move.add(String.format("%c %d",((char)(this.getX()+97+1)),this.getY()));
                        move.add(String.format("%c %d",((char)(this.getX()+97)),this.getY()-1));
                        move.add(String.format("%c %d",((char)(this.getX()+97+1)),this.getY()-1));
                    }
                    else {
                        for(int i=0;i<=1;i++){
                            for (int j=-1;j<=1;j++){
                                move.add(String.format("%c %d",((char)(this.getX()+97+i)),this.getY()+j));
                            }
                        }
                        }
                    }
                else if(this.getX()==7){
                    if(this.getY()==1){
                        move.add(String.format("%c %d",((char)(this.getX()+97-1)),this.getY()));
                        move.add(String.format("%c %d",((char)(this.getX()+97)),this.getY()+1));
                        move.add(String.format("%c %d",((char)(this.getX()+97-1)),this.getY()+1));
                    }
                    else if(this.getY()==8){
                        move.add(String.format("%c %d",((char)(this.getX()+97-1)),this.getY()));
                        move.add(String.format("%c %d",((char)(this.getX()+97)),this.getY()-1));
                        move.add(String.format("%c %d",((char)(this.getX()+97-1)),this.getY()-1));
                    }
                    else {
                        for(int i=0;i<=1;i++){
                            for (int j=-1;j<=1;j++){
                                move.add(String.format("%c %d",((char)(this.getX()+97-i)),this.getY()+j));
                            }
                        }
                    }

                }
                else if(this.getY()==8){
                    for(int i=-1;i<=1;i++){
                        for (int j=0;j<=1;j++){
                            move.add(String.format("%c %d",((char)(this.getX()+97+i)),this.getY()-j));
                        }
                    }

                }
                else if(this.getY()==1){
                    for(int i=-1;i<=1;i++){
                        for (int j=0;j<=1;j++){
                            move.add(String.format("%c %d",((char)(this.getX()+97+i)),this.getY()+j));
                        }
                    }

                }
                else {
                    for (int i=-1;i<=1;i++){
                        for(int j=-1;j<=1;j++){
                            move.add(String.format("%c %d",((char)(this.getX()+97+i)),this.getY()+j));
                        }
                    }
                }
                break;
                }
            case "Queen":{
                if(this.getX()==0){
                    if(this.getY()==1){
                        for (int i=1;i<=7;i++){
                            move.add(String.format("%c %d",((char)(this.getX()+97+i)),this.getY()));
                            move.add(String.format("%c %d",((char)(this.getX()+97)),this.getY()+i));
                            move.add(String.format("%c %d",((char)(this.getX()+97+i)),this.getY()+i));
                        }
                    }
                    else if(this.getY()==8){
                        for (int i=1;i<=7;i++){
                        move.add(String.format("%c %d",((char)(this.getX()+97+i)),this.getY()));
                        move.add(String.format("%c %d",((char)(this.getX()+97)),this.getY()-i));
                        move.add(String.format("%c %d",((char)(this.getX()+97+i)),this.getY()-i));
                        }
                    }
                    else {
                        for (int i=1;i<=7;i++){
                            if(this.getY()+i<=8) {
                                move.add(String.format("%c %d",((char)(this.getX()+97)),this.getY()+i));
                                move.add(String.format("%c %d",((char)(this.getX()+97+i)),this.getY()+i));
                            }
                            if(this.getX()+i<=7){
                                move.add(String.format("%c %d",((char)(this.getX()+97+i)),this.getY()));
                            }
                            if(1<=this.getY()-i) {
                                move.add(String.format("%c %d",((char)(this.getX()+97)),this.getY()-i));
                                move.add(String.format("%c %d",((char)(this.getX()+97+i)),this.getY()-i));
                            }
                        }
                    }
                }
                else if(this.getX()==7){
                    if(this.getY()==1){
                        for (int i=1;i<=7;i++){
                            move.add(String.format("%c %d",((char)(this.getX()+97-i)),this.getY()));
                            move.add(String.format("%c %d",((char)(this.getX()+97)),this.getY()+i));
                            move.add(String.format("%c %d",((char)(this.getX()+97-i)),this.getY()+i));
                        }
                    }
                    else if(this.getY()==8){
                        for (int i=1;i<=7;i++){
                            move.add(String.format("%c %d",((char)(this.getX()+97-i)),this.getY()));
                            move.add(String.format("%c %d",((char)(this.getX()+97)),this.getY()-i));
                            move.add(String.format("%c %d",((char)(this.getX()+97-i)),this.getY()-i));
                        }
                    }
                    else {
                        for (int i=1;i<=7;i++){
                            if(this.getY()+i<=8) {
                                move.add(String.format("%c %d",((char)(this.getX()+97)),this.getY()+i));
                                move.add(String.format("%c %d",((char)(this.getX()+97-i)),this.getY()+i));
                            }
                            if(0<=this.getX()-i){
                                move.add(String.format("%c %d",((char)(this.getX()+97-i)),this.getY()));
                            }
                            if(1<=this.getY()-i) {
                                move.add(String.format("%c %d",((char)(this.getX()+97)),this.getY()-i));
                                move.add(String.format("%c %d",((char)(this.getX()+97-i)),this.getY()-i));
                            }

                        }
                    }

                }
                else if(this.getY()==8){
                    for (int i=1;i<=7;i++){
                        if(this.getX()+i<=7) {
                            move.add(String.format("%c %d",((char)(this.getX()+97+i)),this.getY()));
                            move.add(String.format("%c %d",((char)(this.getX()+97+i)),this.getY()-i));
                        }
                        if(0<=this.getX()-i) {
                            move.add(String.format("%c %d",((char)(this.getX()+97-i)),this.getY()-i));
                            move.add(String.format("%c %d",((char)(this.getX()+97-i)),this.getY()));
                        }
                        if(1<=this.getY()-i) {
                            move.add(String.format("%c %d",((char)(this.getX()+97)),this.getY()-i));
                        }
                    }

                }
                else if(this.getY()==1){
                    for (int i=1;i<=7;i++){
                        if(this.getX()+i<=8) {
                            move.add(String.format("%c %d",((char)(this.getX()+97+i)),this.getY()));
                            move.add(String.format("%c %d",((char)(this.getX()+97+i)),this.getY()+i));
                        }
                        if(0<=this.getX()-i) {
                            move.add(String.format("%c %d",((char)(this.getX()+97-i)),this.getY()+i));
                            move.add(String.format("%c %d",((char)(this.getX()+97-i)),this.getY()));
                        }
                        else {
                            move.add(String.format("%c %d",((char)(this.getX()+97)),this.getY()+i));
                        }
                    }

                }
                else {

                    for (int i=1;i<=7;i++){
                        if(this.getY()+i<=8){
                            move.add(String.format("%c %d",((char)(this.getX()+97)),this.getY()+i));
                        }
                        if(1<=this.getY()-i){
                            move.add(String.format("%c %d",((char)(this.getX()+97)),this.getY()-i));
                        }
                        if(this.getX()+i<=7){
                            move.add(String.format("%c %d",((char)(this.getX()+97+i)),this.getY()));
                        }
                        if(0<=this.getX()-i){
                            move.add(String.format("%c %d",((char)(this.getX()+97-i)),this.getY()));
                        }
                        if((this.getY()+i<=8)&&(this.getX()+i<=7)){
                            move.add(String.format("%c %d",((char)(this.getX()+97+i)),this.getY()+i));
                        }
                        if((this.getY()+i<=8)&&(0<=this.getX()-i)){
                            move.add(String.format("%c %d",((char)(this.getX()+97-i)),this.getY()+i));
                        }
                        if((1<=this.getY()-i)&&(0<=this.getX()-i)){
                            move.add(String.format("%c %d",((char)(this.getX()+97-i)),this.getY()-i));
                        }
                        if((1<=this.getY()-i)&&(this.getX()+i<=7)){
                            move.add(String.format("%c %d",((char)(this.getX()+97+i)),this.getY()-i));
                        }
                    }
                }
            }
            case "Knight":{
                if(this.getX()+1<=7){
                    if(this.getX()+2<=7){
                        if(this.getY()+1<=8){
                            move.add(String.format("%c %d",((char)(this.getX()+97+2)),this.getY()+1));
                        }
                        if(1<=this.getY()-1){
                            move.add(String.format("%c %d",((char)(this.getX()+97+2)),this.getY()-1));
                        }
                    }
                    if(this.getY()+2<=8){
                        move.add(String.format("%c %d",((char)(this.getX()+97+1)),this.getY()+2));
                    }
                    if(1<=this.getY()-2){
                        move.add(String.format("%c %d",((char)(this.getX()+97+1)),this.getY()-2));
                    }
                }
                if(0<=this.getX()-1){
                    if(0<=this.getX()-2){
                        if(this.getY()+1<=8){
                            move.add(String.format("%c %d",((char)(this.getX()+97-2)),this.getY()+1));
                        }
                        if(1<=this.getY()-1){
                            move.add(String.format("%c %d",((char)(this.getX()+97-2)),this.getY()-1));
                        }
                    }
                    if(this.getY()+2<=8){
                        move.add(String.format("%c %d",((char)(this.getX()+97-1)),this.getY()+2));
                    }
                    if(1<=this.getY()-2){
                        move.add(String.format("%c %d",((char)(this.getX()+97-1)),this.getY()-2));
                    }
                }
            }
            case "Bishop":{
                for(int i=1;i<=7;i++){
                    if(((this.getX()+i)<=7)&&((this.getY()+i)<=8)){
                        move.add(String.format("%c %d",((char)(this.getX()+97+i)),this.getY()+i));
                    }
                    if((this.getX()+i<=7)&&(1<=(this.getY()-i))){
                        move.add(String.format("%c %d",((char)(this.getX()+97+i)),this.getY()-i));
                    }
                    if((0<=(this.getX()-i))&&(1<=this.getY()-i)){
                        move.add(String.format("%c %d",((char)(this.getX()+97-i)),this.getY()-i));
                    }
                    if((0<=(this.getX()-i))&&((this.getY()+i)<=8)){
                        move.add(String.format("%c %d",((char)(this.getX()+97-i)),this.getY()+i));
                    }
                }
            }
            case "Rook":{
                for(int i=1;i<=7;i++){
                    if(this.getX()+i<=7){
                        move.add(String.format("%c %d",((char)(this.getX()+97+i)),this.getY()));
                    }
                    if(0<=this.getX()-i){
                        move.add(String.format("%c %d",((char)(this.getX()+97-i)),this.getY()));
                    }
                    if(1<=this.getY()-i){
                        move.add(String.format("%c %d",((char)(this.getX()+97)),this.getY()-i));
                    }
                    if(this.getY()+i<=8){
                        move.add(String.format("%c %d",((char)(this.getX()+97)),this.getY()+i));
                    }

                }
            }
            case "Pawn":{
                if(this.getColor().toLowerCase(Locale.ROOT).equals("black")){
                    move.add(String.format("%c %d",((char)(this.getX()+97)),this.getY()-1));
                    if(this.getY()==1){
                        System.out.println("Пешку черных можно превратить в любую фигуру ");
                    }
                }else {
                    move.add(String.format("%c %d",((char)(this.getX()+97)),this.getY()+1));
                    if(this.getY()==8){
                        System.out.println("Пешку белыйх можно превратить в любую фигуру ");
                    }
                }
            }


        }
        return move;
    }
    public void creatWteam(Pane pane) throws FileNotFoundException {

        int counter;
        Pawn pawn1=new Pawn("w",0);
        Pawn pawn2=new Pawn("w",1);
        Pawn pawn3=new Pawn("w",2);
        Pawn pawn4=new Pawn("w",3);
        Pawn pawn5=new Pawn("w",4);
        Pawn pawn6=new Pawn("w",5);
        Pawn pawn7=new Pawn("w",6);
        Pawn pawn8=new Pawn("w",7);

        List<Pawn> pawnlist=new ArrayList<>();
        pawnlist.add(pawn1);
        pawnlist.add(pawn2);
        pawnlist.add(pawn3);
        pawnlist.add(pawn4);
        pawnlist.add(pawn5);
        pawnlist.add(pawn6);
        pawnlist.add(pawn7);
        pawnlist.add(pawn8);
        for (Pawn p:pawnlist){
            p.getVpawn().setFitWidth(70);
            p.getVpawn().setFitHeight(70);
            if(3<=p.getX()){
                counter=89;
            }else counter=94;
            p.getVpawn().relocate(50+counter*p.getX(),140);
            int finalCounter = counter;
            p.getVpawn().setOnMouseEntered(mouseEvent -> { canmove = p.canMoveTo();});
            p.getVpawn().setOnMousePressed(mouseEvent -> {
                xas=mouseEvent.getSceneX()-p.getVpawn().getTranslateX();
                                                            yas=mouseEvent.getSceneY()-p.getVpawn().getTranslateY();

            });
            int finalCounter1 = counter;
            p.getVpawn().setOnMouseReleased(mouseEvent -> {
                for(String s:canmove){
                    char[] newstr=s.toCharArray();
                   // double xs=(Double.parseDouble((newstr[0]-97)*90+50;
                    System.out.println(newstr[1]);
                    int xs =newstr[0]-97;
                    int ys=newstr[1]-48;
                    double supx=50+xs*50;
                    double supy=50+ys*50;
                    System.out.println(xs+"+"+supx);
                    System.out.println(ys+"+"+supy);
                    System.out.println(p.getVpawn().getTranslateY());
                    System.out.println(p.getVpawn().getTranslateX());
                    System.out.println(s);
                    if(supx+50>=p.getVpawn().getTranslateX()||supx-50<=p.getVpawn().getTranslateX()){
                        if(supy+50>=p.getVpawn().getTranslateY()||supy-50<=p.getVpawn().getTranslateY()){
                            p.setposition(s);
                            p.getVpawn().setTranslateX(supx);
                            p.getVpawn().setTranslateY(supy);
                        }
                    }else{  p.getVpawn().setTranslateX(xas);
                            p.getVpawn().setTranslateY(yas);
                    }
                }
                canmove.clear();

            });
            p.getVpawn().setOnMouseDragged(mouseEvent -> {p.getVpawn().setTranslateX(mouseEvent.getSceneX()-xas);
                                                            p.getVpawn().setTranslateY(mouseEvent.getSceneY()-yas);});
            System.out.println(p.getX());
            pane.getChildren().add(p.getVpawn());
        }





    }
}
