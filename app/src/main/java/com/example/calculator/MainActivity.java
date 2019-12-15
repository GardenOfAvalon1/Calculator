package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.example.calculator.util.Calculate;
import static com.example.calculator.util.DeleteLast.deleteStrings;
import static com.example.calculator.util.DeleteLast.getLastN;
import static com.example.calculator.util.toStringArrays.stringToStringArrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        int orientation = getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_PORTRAIT) {

            setContentView(R.layout.vertical);

            final StringBuffer toCal = new StringBuffer();
            final Calculate newCal = new Calculate();
            final TextView tv1 = findViewById(R.id.textView1);

            Button button0 = (Button)findViewById(R.id.zero);
            button0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    toCal.append("0");
                    tv1.setText(toCal);
                }
            });

            Button button1 = findViewById(R.id.one);
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    toCal.append("1");
                    tv1.setText(toCal);
                }
            });

            Button button2 = findViewById(R.id.two);
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    toCal.append("2");
                    tv1.setText(toCal);
                }
            });

            Button button3 = findViewById(R.id.three);
            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    toCal.append("3");
                    tv1.setText(toCal);
                }
            });

            Button button4 = findViewById(R.id.four);
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    toCal.append("4");
                    tv1.setText(toCal);
                }
            });

            Button button5 = findViewById(R.id.five);
            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    toCal.append("5");
                    tv1.setText(toCal);
                }
            });

            Button button6 = findViewById(R.id.six);
            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    toCal.append("6");
                    tv1.setText(toCal);
                }
            });

            Button button7 = findViewById(R.id.seven);
            button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    toCal.append("7");
                    tv1.setText(toCal);
                }
            });

            Button button8 = findViewById(R.id.eight);
            button8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    toCal.append("8");
                    tv1.setText(toCal);
                }
            });

            Button button9 = findViewById(R.id.nine);
            button9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    toCal.append("9");
                    tv1.setText(toCal);
                }
            });

            Button button_AC = findViewById(R.id.delete);
            button_AC.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    tv1.setText("请输入");
                    toCal.delete(0, toCal.length());
                }
            });

            Button button_ride = findViewById(R.id.multiply);
            button_ride.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    toCal.append("*");
                    tv1.setText(toCal);
                }
            });

            Button button_div = findViewById(R.id.divide);
            button_div.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    toCal.append("/");
                    tv1.setText(toCal);
                }
            });

            Button button_back = findViewById(R.id.back);
            button_back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    if (toCal.length() - 1 > 0) {
                        int n = toCal.length() - 1;
                        String s0 = toCal.toString();
                        String[] s = stringToStringArrays(s0);
                        String s2 =deleteStrings(s,1);
                        toCal.setLength(0);
                        toCal.append(s2);
                        tv1.setText(s2);
                    } else {
                        tv1.setText("请输入");//在输入面板中没有对象时不会闪退
                    }
                }
            });

            Button button_sub = findViewById(R.id.subtract);
            button_sub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    toCal.append("-");
                    tv1.setText(toCal);
                }
            });

            Button button_add = findViewById(R.id.add);
            button_add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    toCal.append("+");
                    tv1.setText(toCal);
                }
            });

            Button button_percent = findViewById(R.id.percent);
            button_percent.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    toCal.append("%");
                    tv1.setText(toCal);
                }
            });

            Button button_p = findViewById(R.id.point);
            button_p.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    toCal.append(".");
                    tv1.setText(toCal);
                }
            });

            Button button_equ = findViewById(R.id.equal);
            button_equ.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    String st = toCal.toString();
                    if(st.length()>0) {
                        StringBuffer sb = newCal.toPostfixString(st);
                        Double res = newCal.toValue(sb);
                        String strDouble = String.valueOf(res);
                        toCal.delete(0, toCal.length());
                        toCal.append(strDouble);
                        tv1.setText(strDouble);
                    }else {
                        Toast.makeText(MainActivity.this,"请输入",Toast.LENGTH_SHORT).show();
                    }
                }
            });

            Button button_e = findViewById(R.id.e);
            button_e.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    Double d = Math.E;
                    toCal.append(d.toString());
                    tv1.setText(toCal);
                }
            });

            Button button_zkh = findViewById(R.id.openParen);
            button_zkh.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    toCal.append("(");
                    tv1.setText(toCal);
                }
            });

            Button button_ykh = findViewById(R.id.closeParen);
            button_ykh.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    toCal.append(")");
                    tv1.setText(toCal);
                }
            });
        }

        else if (orientation == Configuration.ORIENTATION_LANDSCAPE) {

            setContentView(R.layout.horizontal);

            final StringBuffer toCal2 = new StringBuffer();
            final Calculate newCal = new Calculate();
            final TextView tv2 = findViewById(R.id.textView2);

            Button button0 = findViewById(R.id.zero);
            button0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    toCal2.append("0");
                    tv2.setText(toCal2);
                }
            });

            Button button1 = findViewById(R.id.one);
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    toCal2.append("1");
                    tv2.setText(toCal2);
                }
            });

            Button button2 = findViewById(R.id.two);
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    toCal2.append("2");
                    tv2.setText(toCal2);
                }
            });

            Button button3 = findViewById(R.id.three);
            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    toCal2.append("3");
                    tv2.setText(toCal2);
                }
            });

            Button button4 = findViewById(R.id.four);
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    toCal2.append("4");
                    tv2.setText(toCal2);
                }
            });

            Button button5 = findViewById(R.id.five);
            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    toCal2.append("5");
                    tv2.setText(toCal2);
                }
            });

            Button button6 = findViewById(R.id.six);
            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    toCal2.append("6");
                    tv2.setText(toCal2);
                }
            });

            Button button7 = findViewById(R.id.seven);
            button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    toCal2.append("7");
                    tv2.setText(toCal2);
                }
            });

            Button button8 = findViewById(R.id.eight);
            button8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    toCal2.append("8");
                    tv2.setText(toCal2);
                }
            });

            Button button9 = findViewById(R.id.nine);
            button9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    toCal2.append("9");
                    tv2.setText(toCal2);
                }
            });

            Button button_AC = findViewById(R.id.delete);
            button_AC.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    tv2.setText("请输入");
                    toCal2.delete(0, toCal2.length());
                }
            });

            Button button_ride = findViewById(R.id.multiply);
            button_ride.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    toCal2.append("*");
                    tv2.setText(toCal2);
                }
            });

            Button button_div = findViewById(R.id.divide);
            button_div.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    toCal2.append("/");
                    tv2.setText(toCal2);
                }
            });

            Button button_back = findViewById(R.id.back);
            button_back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    if (toCal2.length() - 1 > 0) {
                        int n = toCal2.length() - 1;
                        String s0 = toCal2.toString();
                        String[] s = stringToStringArrays(s0);
                        String s2 =deleteStrings(s,1);
                        toCal2.setLength(0);
                        toCal2.append(s2);
                        tv2.setText(s2);
                    } else {
                        tv2.setText("请输入");      //在输入面板中没有对象时不会闪退
                    }
                }
            });

            Button button_sub = findViewById(R.id.subtract);
            button_sub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    toCal2.append("-");
                    tv2.setText(toCal2);
                }
            });

            Button button_add = findViewById(R.id.add);
            button_add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    toCal2.append("+");
                    tv2.setText(toCal2);
                }
            });

            Button button_p = findViewById(R.id.point);
            button_p.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    toCal2.append(".");
                    tv2.setText(toCal2);
                }
            });

            Button button_equ = findViewById(R.id.equal);
            button_equ.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    String st = toCal2.toString();
                    if(st.length()>0) {
                        StringBuffer sb = newCal.toPostfixString(st);
                        Double res = newCal.toValue(sb);
                        String strDouble = String.valueOf(res);
                        toCal2.delete(0, toCal2.length());
                        toCal2.append(strDouble);
                        tv2.setText(strDouble);
                    }else {
                        Toast.makeText(MainActivity.this,"请输入",Toast.LENGTH_SHORT).show();
                    }
                }
            });

            Button button_lf = findViewById(R.id.cube);
            button_lf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    toCal2.append("^3");
                    tv2.setText(toCal2);
                    toCal2.delete(toCal2.length()-2,toCal2.length());
                    String s0 = toCal2.toString();
                    String[] s1 = stringToStringArrays(s0);
                    String s = getLastN(s1,1);
                    Double d = Double.parseDouble(s);
                    Double b = d*d*d;
                    Log.d("tag","b的值是："+b);
                    String s2 = deleteStrings(s1,1);
                    toCal2.setLength(0);
                    toCal2.append(s2);
                    toCal2.append( b.toString());
                }
            });

            Button button_pf = findViewById(R.id.squared);
            button_pf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    toCal2.append("^2");
                    tv2.setText(toCal2);
                    toCal2.delete(toCal2.length()-2,toCal2.length());
                    String s0 = toCal2.toString();
                    String[] s1 = stringToStringArrays(s0);
                    String s = getLastN(s1,1);
                    Double d = Double.parseDouble(s);
                    Double b = d*d;
                    Log.d("tag","b的值是："+b);
                    String s2 = deleteStrings(s1,1);
                    toCal2.setLength(0);
                    toCal2.append(s2);
                    toCal2.append( b.toString());
                }
            });

            Button button_jc = findViewById(R.id.factorial);
            button_jc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    String s0 = toCal2.toString();
                    String[] s1 = stringToStringArrays(s0);
                    String s = getLastN(s1,1);
                    Double d = Double.parseDouble(s);
                    Double b = 1.0;
                    for(int i = 1 ; i <= d ; i++) {
                        b=b*i;
                    }
                    Log.d("tag","b的值是："+b);
                    String s2 = deleteStrings(s1,1);
                    toCal2.setLength(0);
                    toCal2.append(s2);
                    toCal2.append( b.toString());
                    tv2.setText(toCal2);
                }
            });

            Button button_gh = findViewById(R.id.radical);
            button_gh.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    String s0 = toCal2.toString();
                    String[] s1 = stringToStringArrays(s0);
                    String s = getLastN(s1,1);
                    Double d = Double.parseDouble(s);
                    Double b = Math.sqrt(d);
                    Log.d("tag","b的值是："+b);
                    String s2 = deleteStrings(s1,1);
                    toCal2.setLength(0);
                    toCal2.append(s2);
                    toCal2.append( b.toString());
                    tv2.setText(toCal2);
                }
            });

            Button button_ln = findViewById(R.id.ln);
            button_ln.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    String s0 = toCal2.toString();
                    String[] s1 = stringToStringArrays(s0);
                    String s = getLastN(s1,1);
                    Double d = Double.parseDouble(s);
                    Double b = Math.log(d);
                    Log.d("tag","b的值是："+b);
                    String s2 = deleteStrings(s1,1);
                    toCal2.setLength(0);
                    toCal2.append(s2);
                    toCal2.append( b.toString());
                    tv2.setText(toCal2);
                }
            });

            Button button_cos = findViewById(R.id.cos);
            button_cos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    String s0 = toCal2.toString();
                    String[] s1 = stringToStringArrays(s0);
                    String s = getLastN(s1,1);
                    Double d = Double.parseDouble(s);
                    Double b = Math.cos(d);
                    Log.d("tag","b的值是："+b);
                    String s2 = deleteStrings(s1,1);
                    toCal2.setLength(0);
                    toCal2.append(s2);
                    toCal2.append( b.toString());
                    tv2.setText(toCal2);
                }
            });

            Button button_sin = findViewById(R.id.sin);
            button_sin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    String s0 = toCal2.toString();
                    String[] s1 = stringToStringArrays(s0);
                    String s = getLastN(s1,1);
                    Double d = Double.parseDouble(s);
                    Double b = Math.sin(d);
                    Log.d("tag","b的值是："+b);
                    String s2 = deleteStrings(s1,1);
                    toCal2.setLength(0);
                    toCal2.append(s2);
                    toCal2.append( b.toString());
                    tv2.setText(toCal2);
                }
            });

            Button button_tan = findViewById(R.id.tan);
            button_tan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    String s0 = toCal2.toString();
                    String[] s1 = stringToStringArrays(s0);
                    String s = getLastN(s1,1);
                    Double d = Double.parseDouble(s);
                    Double b = Math.tan(d);
                    Log.d("tag","b的值是："+b);
                    String s2 = deleteStrings(s1,1);
                    toCal2.setLength(0);
                    toCal2.append(s2);
                    toCal2.append( b.toString());
                    tv2.setText(toCal2);
                }
            });

            Button button_zkh = findViewById(R.id.openParen);
            button_zkh.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    toCal2.append("(");
                    tv2.setText(toCal2);
                }
            });

            Button button_ykh = findViewById(R.id.closeParen);
            button_ykh.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //处理事件
                    toCal2.append(")");
                    tv2.setText(toCal2);
                }
            });
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.lengthexchange:
                Intent intent = new Intent(MainActivity.this,LengthActivity.class);
                startActivity(intent);
                break;
            case R.id.baseexchange:
                Intent intent1 = new Intent(MainActivity.this,BaseActivity.class);
                startActivity(intent1);
                break;
            case R.id.help:
                Toast.makeText(this, "请把手机横过来", Toast.LENGTH_SHORT).show();
                break;
            case R.id.exit:
                finish();
                break;
            default:
        }
        return true;
    }
}
