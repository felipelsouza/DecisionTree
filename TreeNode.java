package decisiontree;

public class TreeNode {
  TreeNode leftNode;
  TreeNode rightNode;
  int id;
  String question;

  public TreeNode(int nodeId, String nodeQuestion){
    id = nodeId;
    question = nodeQuestion;
    leftNode = rightNode = null;
  }

  public void insertNode(int value, String question){
    if (value < id){
      if (leftNode == null)
        leftNode = new TreeNode(value, question);
      else
        leftNode.insertNode(value, question);
    } else if (value > id) {
      if (rightNode == null)
	    rightNode = new TreeNode(value, question);
      else
	    rightNode.insertNode(value, question);
    }
  }
}