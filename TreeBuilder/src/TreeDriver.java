import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


public class TreeDriver {

	public static void main(String[] args) {
		TreeDrawer tre = new TreeDrawer();
		int lSize;
		int xSize;
		int ySize;
		List<String> optionList = new ArrayList<String>();
		 optionList.add("<Select Below>");
		 optionList.add("Depth Three");
		 optionList.add("Depth Four");
		 optionList.add("Depth Five");
		 optionList.add("Depth Six");
		 optionList.add("Depth Seven");
		 optionList.add("Depth Eight");
		 optionList.add("Depth Nine :o");
		 optionList.add("Depth Ten?!");
		 optionList.add("Depth = SO MUCH TREE");
		 Object[] options = optionList.toArray();
		 Object value = JOptionPane.showInputDialog(null, "Tree depth?", "input box", 0, null, options, 0);
		 int index = optionList.indexOf(value)+12  ;
		 if(index > 8 && index < 10){
			 lSize = 200;
			 xSize = -100;
			 ySize = -300;
		 }
		 else if(index > 9){
			 lSize = 100;
			 xSize = -100;
			 ySize = -400;
		 }
		 else{
			 xSize = -150;
			 ySize = -300;
			 lSize = 100;
		 }
		 if(index == 2||index == 1)
			 return;
//		 if(index == 6){
//		 
//		 }
		 tre.setupWorld();
		 tre.drawTree(lSize, index, xSize, ySize-60, 90, 58, 0, 0);
		 System.out.println("Index = "+index);
	}


}
