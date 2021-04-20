 public static TreeNode<Integer> takeInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the next node");
        int data = scan.nextInt();
        TreeNode<Integer> root = new TreeNode<>(data);
        System.out.println("Enter the children of " + data);
        int children = scan.nextInt();
        for (int i = 0; i < children; i++) {
            TreeNode<Integer> child = takeInput();
            root.children.add(child);

        }
        return root;
    }
