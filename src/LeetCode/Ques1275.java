package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Ques1275 {
    public String tictactoe(int[][] moves) {

        HashMap<String, Integer> player1 = new HashMap<>();
        player1.put("1stCol", 0);
        player1.put("2ndCol", 0);
        player1.put("3rdCol", 0);
        player1.put("1stRow", 0);
        player1.put("2ndRow", 0);
        player1.put("3rdRow", 0);
        player1.put("priDiagonal", 0);
        player1.put("secDiagonal", 0);

        HashMap<String,Integer> player2= (HashMap<String,Integer>)player1.clone();


        for(int i=0;i<moves.length;i++){
            if(i%2==0){
                if(populateMap(moves[i][0],moves[i][1],player1)){
                    return "A";
                }
            }
            else{
                if(populateMap(moves[i][0],moves[i][1],player2)){
                    return "B";
                }
            }
        }

        if(moves.length<9){
            return "Pending";
        }

        return "Draw";

    }

    public Boolean populateMap(int row,int col,HashMap<String,Integer> playerMap){
        if(col==0){
            if(playerMap.get("1stCol")==2){
                return true;
            }
            else{
                playerMap.put("1stCol",playerMap.get("1stCol")+1);
            }
        }
        if(col==1){
            if(playerMap.get("2ndCol")==2){
                return true;
            }
            else{
                playerMap.put("2ndCol",playerMap.get("2ndCol")+1);
            }
        }
        if(col==2){
            if(playerMap.get("3rdCol")==2){
                return true;
            }
            else{
                playerMap.put("3rdCol",playerMap.get("3rdCol")+1);
            }
        }
        if(row==0){
            if(playerMap.get("1stRow")==2){
                return true;
            }
            else{
                playerMap.put("1stRow",playerMap.get("1stRow")+1);
            }
        }
        if(row==1){
            if(playerMap.get("2ndRow")==2){
                return true;
            }
            else{
                playerMap.put("2ndRow",playerMap.get("2ndRow")+1);
            }
        }
        if(row==2){
            if(playerMap.get("3rdRow")==2){
                return true;
            }
            else{
                playerMap.put("3rdRow",playerMap.get("3rdRow")+1);
            }
        }
        if(row==col){
            if(playerMap.get("priDiagonal")==2){
                return true;
            }
            else{
                playerMap.put("priDiagonal",playerMap.get("priDiagonal")+1);
            }
        }
        if(col+row==2){
            if(playerMap.get("secDiagonal")==2){
                return true;
            }
            else{
                playerMap.put("secDiagonal",playerMap.get("secDiagonal")+1);
            }
        }

        return false;
    }
}
