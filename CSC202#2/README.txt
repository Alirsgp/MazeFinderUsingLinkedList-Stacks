STEPS TO RUN.

1. Open up command prompt/terminal, change your directory to be the same as the location of this program. ('cd' changes directory)

2. Compile MyMaze.java by typing javac MyMaze.java

3. Drag and drop/create your text file to be inside the src/bin folder containing all other files for the program.
   - Your file must be a 10x10 maze, with only '1', '0', 'E', and '*'. You can only have one start/end point.

4. Run MyMaze.java in your command prompt, enter a text file. There is an example text file called 'maze.txt', feel
free to copy/paste your 10x10 maze into that text file if you don't already have your own file. If you enter an invalid file-name, the program will prompt you to re-run and enter a file name that exists.

5. The coordinates from start to finish will be outputted via (x, y) positions. (0, 0) starts from top left, and Y-values increment from bottom-down, X-values increment from left-right. If no connected coordinates from start to finish
exist, outputs 'No Way Out'.