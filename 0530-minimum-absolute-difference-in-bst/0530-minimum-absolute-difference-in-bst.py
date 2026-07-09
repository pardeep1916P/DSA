# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:

    #global variables to save state
    def __init__(self):
        self.prev = None
        self.minDiff = float('inf')

    def getMinimumDifference(self, root: Optional[TreeNode]) -> int:
        self.inorder(root)
        return self.minDiff
    
    #helper method for recursion
    def inorder(self,root):
        if not root: return

        self.inorder(root.left) # traversing left subtree

        #calcualting current difference
        if self.prev is not None: self.minDiff = self.minDiff if self.minDiff < root.val - self.prev.val else root.val - self.prev.val

        self.prev = root

        self.inorder(root.right) # traversing right subtree


        