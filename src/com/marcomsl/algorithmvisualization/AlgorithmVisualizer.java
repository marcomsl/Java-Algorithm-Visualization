package com.marcomsl.algorithmvisualization;

import java.util.ArrayList;
import java.util.Random;

public class AlgorithmVisualizer {

    AlgorithmFrame algorithmFrame;

    private int[] array;
    private ArrayList<Integer> arrayList = new ArrayList<>();

    public AlgorithmVisualizer(){
        array = new int[50];
        fillArray();
        algorithmFrame = new AlgorithmFrame(array);

    }

    private void fillArray(){
        for(int i = 0; i < array.length; i++){
            arrayList.add ((i + 1) * 6);
        }

        Random random = new Random();

        for(int i = 0; i < array.length; i++){
            int randomIndex = random.nextInt(arrayList.size());
            array[i] = arrayList.get(randomIndex);
            arrayList.remove(randomIndex);
        }
    }

    public int[] getArray() {
        return array;
    }

}
