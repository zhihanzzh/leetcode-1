/*
  File Name: 094BinaryTreeInorderTraversal.cpp
  Xiaolong Zhang

  Question:
  Given a binary tree, return the inorder 
  traversal of its nodes' values.

  For example:
  Given binary tree {1,#,2,3},
       1
        \
         2
        /
       3
    return [1,3,2].

  Note: Recursive solution is trivial, 
  could you do it iteratively?

*/

/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    vector<int> inorderTraversal(TreeNode* root) {
        stack<TreeNode*> myStack;
        vector<int> res;
        while(root!=NULL || !myStack.empty()){
            if(root!=NULL){
                myStack.push(root);
                root=root->left;
            }
            else{
                root=myStack.top();
                myStack.pop();
                res.push_back(root->val);
                root=root->right;
            }
            
        }
        return res;     
    }
};