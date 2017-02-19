package com.example.georgetsulaiman.i7437472;


import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;




public class NetwalkView3 extends View {

    private NetwalkGrid View = new NetwalkGrid(9, 9); //9 by 9 grid created
    private GestureDetector  mGestureDetector;
    private int eachCellWidth, eachCellHeight;
    private int moves = 0;
    int [] completearray;

    Bitmap bmp_1;
    Bitmap bmp_2;
    Bitmap bmp_3;
    Bitmap bmp_4;
    Bitmap bmp_5;
    Bitmap bmp_6;
    Bitmap bmp_7;
    Bitmap bmp_8;
    Bitmap bmp_9;
    Bitmap bmp_10;
    Bitmap bmp_11;
    Bitmap bmp_12;
    Bitmap bmp_13;
    Bitmap bmp_14;
    Bitmap bmp_15;
    Bitmap bmp_16;
    Bitmap bmp_17;
    Bitmap bmp_18;
    Bitmap bmp_19;
    Bitmap bmp_20;
    Bitmap bmp_21;
    Bitmap bmp_22;
    Bitmap bmp_23;
    Bitmap bmp_24;
    Bitmap bmp_25;
    Bitmap bmp_26;
    Bitmap bmp_27;
    Bitmap bmp_28;

    // each bitmap image is initialised and has its specific variable.


    ArrayList<Bitmap> bitmapArray = new ArrayList<Bitmap>(); // An array of the bitmap


    public NetwalkView3(Context context) {
        super(context);
        init();

        mGestureDetector = new GestureDetector(context, new MyGestureListener()); // Gesture listener variable created for use.

    }

    Paint mGridPaint = new Paint(Paint.ANTI_ALIAS_FLAG);  // Colour of grid


    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);



        eachCellWidth = getWidth() / View.getColumns(); // Gets width of grid
        eachCellHeight = (getHeight() -400) / View.getRows(); // gets height of grid and adjusts the size to make it smaller



        for (int rows = 0; rows < View.getRows(); rows++) {
            for (int cols = 0; cols < View.getColumns(); cols++) {


                canvas.drawLine(0, cols * eachCellHeight, getWidth(), cols * eachCellHeight, mGridPaint); // draws the line of the grid for both width and height
                canvas.drawLine(rows * eachCellWidth, 0, rows * eachCellWidth, (getHeight() -400), mGridPaint); // draws the line of the grid for both width and height. // adjusts height of the grid
                canvas.drawText("moves : " + moves, 300, 1400, mGridPaint);
                mGridPaint.setTextSize(100);



                int cellContent = View.getGridElem(cols,rows); // gets grid value for each cell

                if (cellContent == 40){ // if the cell value is equal to 40

                    canvas.drawBitmap(bmp_1, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }
                // get the specific bitmap image and put it in that specific cell.
                if (cellContent == 36){

                    canvas.drawBitmap(bmp_2, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 34){

                    canvas.drawBitmap(bmp_3, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 33){

                    canvas.drawBitmap(bmp_4, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 3) {

                    canvas.drawBitmap(bmp_5, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 10){

                    canvas.drawBitmap(bmp_6, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 6){

                    canvas.drawBitmap(bmp_7, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 14){

                    canvas.drawBitmap(bmp_8, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 9){

                    canvas.drawBitmap(bmp_9, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 5){

                    canvas.drawBitmap(bmp_10, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 13){

                    canvas.drawBitmap(bmp_11, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 12){

                    canvas.drawBitmap(bmp_12, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 11){

                    canvas.drawBitmap(bmp_13, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 7){

                    canvas.drawBitmap(bmp_14, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 88){

                    canvas.drawBitmap(bmp_15, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 84){

                    canvas.drawBitmap(bmp_16, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 92){

                    canvas.drawBitmap(bmp_17, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }
                if (cellContent == 82){

                    canvas.drawBitmap(bmp_18, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 90){

                    canvas.drawBitmap(bmp_19, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 86){

                    canvas.drawBitmap(bmp_20, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 94){

                    canvas.drawBitmap(bmp_21, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 81){

                    canvas.drawBitmap(bmp_22, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 89){

                    canvas.drawBitmap(bmp_23, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 85){

                    canvas.drawBitmap(bmp_24, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 93){

                    canvas.drawBitmap(bmp_25, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 83){

                    canvas.drawBitmap(bmp_26, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 91){

                    canvas.drawBitmap(bmp_27, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 87){

                    canvas.drawBitmap(bmp_28, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }


            }

        }

    }
    // onTouchEvent() method of the View class gets called each time you perform any
    // touch event with screen

    public boolean onTouchEvent(MotionEvent ev)    {
        // The line below passes the event to the onTouchEvent method of the GestureDetector class.
        // This analyzes the event and if applicable triggers the appropriate callbacks in the
        // GestureDetector.OnSimpleGestureListener class.


        this.mGestureDetector.onTouchEvent(ev);

        return super.onTouchEvent(ev);
    }


    // This GestureListener class is enclosed within the GameView class


    class MyGestureListener extends GestureDetector.SimpleOnGestureListener     {

        // You should always include onDown() and it should always return true.
        // Otherwise the GestureListener may ignore other events.


        public boolean onDown(MotionEvent ev) {
            return true;
        }

        public void onLongPress(MotionEvent ev) {
            // Get location of touch, calculate the column that has been clicked.
            // Call the playToken method of Game to make coloured piece appear.
            // Use invalidate() to cause view to be redrawn.

            int x = (int) ev.getX();
            int y = (int) ev.getY();

            int touchX = (x / eachCellWidth); // gets location of width for each cell in the grid
            int touchY = (y / eachCellHeight); // gets location of height for each cell in the grid

            View.rotateRight(touchX, touchY); // rotates the image to the right


            invalidate();

            moves = moves + 1;

            if (Arrays.equals(completearray, View.mGrid))


            {

                AlertDialog.Builder message = new AlertDialog.Builder(Hard.mDialogContext);
                message.setTitle("Game completed in "+moves+" moves, Play again?");
                message.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        Intent intent = new Intent(getContext(), Difficulty.class);
                        getContext().startActivity(intent);
                    }
                });
                message.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        Intent intent = new Intent(getContext(), MainActivity.class);
                        getContext().startActivity(intent);
                    }
                });
                message.show();
            }
        }

    }  // End of MyGestureListener class

    public void init() {

        mGridPaint.setStyle(Paint.Style.FILL_AND_STROKE); // fill and gives a stroke to the grid
        mGridPaint.setColor(0xff0000ff); // sets the colour of the grid lines

        completearray = View.mGrid.clone();

        bmp_1 = BitmapFactory.decodeResource(getResources(), R.drawable.node1);
        bmp_2 = BitmapFactory.decodeResource(getResources(), R.drawable.node2);
        bmp_3 = BitmapFactory.decodeResource(getResources(), R.drawable.node3);
        bmp_4 = BitmapFactory.decodeResource(getResources(), R.drawable.node4);
        bmp_5 = BitmapFactory.decodeResource(getResources(), R.drawable.pipe1);
        bmp_6 = BitmapFactory.decodeResource(getResources(), R.drawable.pipe2);
        bmp_7 = BitmapFactory.decodeResource(getResources(), R.drawable.pipe3);
        bmp_8 = BitmapFactory.decodeResource(getResources(), R.drawable.pipe4);
        bmp_9 = BitmapFactory.decodeResource(getResources(), R.drawable.pipe5);
        bmp_10 = BitmapFactory.decodeResource(getResources(), R.drawable.pipe6);
        bmp_11 = BitmapFactory.decodeResource(getResources(), R.drawable.pipe7);
        bmp_12 = BitmapFactory.decodeResource(getResources(), R.drawable.pipe8);
        bmp_13 = BitmapFactory.decodeResource(getResources(), R.drawable.pipe9);
        bmp_14 = BitmapFactory.decodeResource(getResources(), R.drawable.pipe10);
        bmp_15 = BitmapFactory.decodeResource(getResources(), R.drawable.server1);
        bmp_16 = BitmapFactory.decodeResource(getResources(), R.drawable.server2);
        bmp_17 = BitmapFactory.decodeResource(getResources(), R.drawable.server3);
        bmp_18 = BitmapFactory.decodeResource(getResources(), R.drawable.server4);
        bmp_19 = BitmapFactory.decodeResource(getResources(), R.drawable.server5);
        bmp_20 = BitmapFactory.decodeResource(getResources(), R.drawable.server6);
        bmp_21 = BitmapFactory.decodeResource(getResources(), R.drawable.server7);
        bmp_22 = BitmapFactory.decodeResource(getResources(), R.drawable.server8);
        bmp_23 = BitmapFactory.decodeResource(getResources(), R.drawable.server9);
        bmp_24 = BitmapFactory.decodeResource(getResources(), R.drawable.server10);
        bmp_25 = BitmapFactory.decodeResource(getResources(), R.drawable.server11);
        bmp_26 = BitmapFactory.decodeResource(getResources(), R.drawable.server12);
        bmp_27 = BitmapFactory.decodeResource(getResources(), R.drawable.server13);
        bmp_28 = BitmapFactory.decodeResource(getResources(), R.drawable.server14);

        // all of the bitmap images are displayed onto the grid.

        bitmapArray.add(bmp_1);
        bitmapArray.add(bmp_2);
        bitmapArray.add(bmp_3);
        bitmapArray.add(bmp_4);
        bitmapArray.add(bmp_5);
        bitmapArray.add(bmp_6);
        bitmapArray.add(bmp_7);
        bitmapArray.add(bmp_8);
        bitmapArray.add(bmp_9);
        bitmapArray.add(bmp_10);
        bitmapArray.add(bmp_11);
        bitmapArray.add(bmp_12);
        bitmapArray.add(bmp_13);
        bitmapArray.add(bmp_14);
        bitmapArray.add(bmp_15);
        bitmapArray.add(bmp_16);
        bitmapArray.add(bmp_17);
        bitmapArray.add(bmp_18);
        bitmapArray.add(bmp_19);
        bitmapArray.add(bmp_20);
        bitmapArray.add(bmp_21);
        bitmapArray.add(bmp_22);
        bitmapArray.add(bmp_23);
        bitmapArray.add(bmp_24);
        bitmapArray.add(bmp_25);
        bitmapArray.add(bmp_26);
        bitmapArray.add(bmp_27);
        bitmapArray.add(bmp_28);

        // all the images are added into the array.


        for (int rows = 0; rows < View.getRows(); rows++) {
            for (int cols = 0; cols < View.getColumns(); cols++) {

                Random rand = new Random(1 - 3); // randomises the images from the grid 1-3 times
                for (int change = 1; change < rand.nextInt(); change++); { // each  bitmap image is changed due to rotation

                    View.rotateRight(cols, rows); // columns and rows are rotated


                }

            }


        }
    }}