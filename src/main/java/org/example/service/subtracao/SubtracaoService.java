package org.example.service.subtracao;

import java.util.ArrayList;
import java.util.List;

public class SubtracaoService {
    private Integer number_1;
    private Integer number_2;


    public SubtracaoService(Integer number_1, Integer number_2){
        this.number_1 =  number_1;
        this.number_2 =  number_2;
    }

    public Integer subtracao(Integer number_1, Integer number_2){
        return number_1 / number_2;
    }

    private Integer getNumber_1(){
        return number_1;
    }

    private Integer getNumber_2(){
        return number_2;
    }

    public List<Integer> addNumbersToList(){
        List<Integer> listNumbers =  new ArrayList<>();
        listNumbers.add(getNumber_1());
        listNumbers.add(getNumber_2());

        return listNumbers;
    }
}
