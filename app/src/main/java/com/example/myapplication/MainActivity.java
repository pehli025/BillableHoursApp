package com.example.myapplication;

import android.graphics.Paint;
import android.os.Bundle;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import androidx.navigation.ui.AppBarConfiguration;
import com.example.myapplication.databinding.ActivityMainBinding;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    private short lof_; //Lube Oil Filter
    private short brake_; // Brakes
    private short fuelsys_; // Fuel System Treatment
    private short pwrstr_; // Power Steering flush
    private short trans_; // Transmission flush
    private short diff_; //Differential Flush
    private short tCase_; // Transfer Case Service
    private short ac_; // AC service
    private short cf_; // Coolant flush
    private short sMon; // Six month Alignment
    private short oneYr; // One year alignment
    private short threeYr; // Three year alignment
    private short fiveYr; // Five year alignment
    private short spAlign; // Speciality Alignment
    private short poAlign; // Policy Alignment
    private short tireMounts;
    private short tireBalances;
    private short tireRotations;
    private short tireFlatRepairs;
    private short tireTpmsResets;
    private short airFilter;
    private short cabinFilter;
    private short miniBulb;
    private short batteryCorrosion;
    private short batteryInstall;
    private short padsAndRotors;
    private short brakeCleanAdjust;
    private short wiperBlades;
    private double hoursWorked;

    public short checkBlank(EditText et) {
        if(et.length() == 0) {
            return 0;
        }
        else {
            return Short.parseShort(et.getText().toString());
        }
    } //Checks base case for each job before setting.

    public short getAirFilter() {
        return airFilter;
    }
    public void setAirFilter(EditText airFilter) {
        this.airFilter = checkBlank(airFilter);
    }
    public short getCabinFilter() {
        return cabinFilter;
    }
    public void setCabinFilter(EditText cabinFilter) {
        this.cabinFilter = checkBlank(cabinFilter);
    }
    public short getMiniBulb() {
        return miniBulb;
    }
    public void setMiniBulb(EditText miniBulb) {
        this.miniBulb = checkBlank(miniBulb);
    }
    public short getBatteryCorrosion() {
        return batteryCorrosion;
    }
    public void setBatteryCorrosion(EditText batteryCorrosion) {
        this.batteryCorrosion = checkBlank(batteryCorrosion);
    }
    public short getBatteryInstall() {
        return batteryInstall;
    }
    public void setBatteryInstall(EditText batteryInstall) {
        this.batteryInstall = checkBlank(batteryInstall);
    }
    public short getPadsAndRotors() {
        return padsAndRotors;
    }
    public void setPadsAndRotors(EditText padsAndRotors) {
        this.padsAndRotors = checkBlank(padsAndRotors);
    }
    public short getBrakeCleanAdjust() {
        return brakeCleanAdjust;
    }
    public void setBrakeCleanAdjust(EditText brakeCleanAdjust) {
        this.brakeCleanAdjust = checkBlank(brakeCleanAdjust);
    }
    public short getWiperBlades() {
        return wiperBlades;
    }
    public void setWiperBlades(EditText wiperBlades) {
        this.wiperBlades = checkBlank(wiperBlades);
    }
    public short getTireMounts() {
        return tireMounts;
    }
    public void setTireMounts(EditText tireMounts) {
        this.tireMounts = checkBlank(tireMounts);
    }
    public short getTireBalances() {
        return tireBalances;
    }
    public void setTireBalances(EditText tireBalances) {
        this.tireBalances = checkBlank(tireBalances);
    }
    public short getTireRotations() {
        return tireRotations;
    }
    public void setTireRotations(EditText tireRotations) {
        this.tireRotations = checkBlank(tireRotations);
    }
    public short getTireFlatRepairs() {
        return tireFlatRepairs;
    }
    public void setTireFlatRepairs(EditText tireFlatRepairs) {
        this.tireFlatRepairs = checkBlank(tireFlatRepairs);
    }
    public short getTireTpmsResets() {
        return tireTpmsResets;
    }
    public void setTireTpmsResets(EditText tireTmpsResets) {
        this.tireTpmsResets = checkBlank(tireTmpsResets);
    }
    public short getLof() {
        return lof_;
    }
    public void setLof(EditText lof) {
        if(lof.length() == 0) {
            lof_ = 0;
        }
        else {
            lof_ = Short.parseShort(lof.getText().toString());
        }
    }
    public short getBrake() {
        return brake_;
    }
    public void setBrake(EditText brake) {
        if(brake.length() == 0) {
            brake_ = 0;
        }
        else {
            brake_ = Short.parseShort(brake.getText().toString());
        }
    }
    public short getFuelsys() {
        return fuelsys_;
    }
    public void setFuelsys(EditText fuelsys) {
        if(fuelsys.length() == 0) {
            fuelsys_ = 0;
        }
        else {
            fuelsys_ = Short.parseShort(fuelsys.getText().toString());
        }
    }
    public short getTrans() {
        return trans_;
    }
    public void setTrans(EditText trans) {
        if(trans.length() == 0) {
            trans_ = 0;
        }
        else {
            trans_ = Short.parseShort(trans.getText().toString());
        }
    }
    public short getDiff() {
        return diff_;
    }
    public void setDiff(EditText diff) {
        if(diff.length() == 0) {
            diff_ = 0;
        }
        else {
            diff_ = Short.parseShort(diff.getText().toString());
        }
    }
    public short gettCase() {
        return tCase_;
    }
    public void settCase(EditText tCase) {
        if(tCase.length() == 0) {
            tCase_ = 0;
        }
        else {
            tCase_ = Short.parseShort(tCase.getText().toString());
        }
    }
    public short getAc() {
        return ac_;
    }
    public void setAc(EditText ac) {
        if(ac.length() == 0) {
            ac_ = 0;
        }
        else {
            ac_ = Short.parseShort(ac.getText().toString());
        }
    }
    public short getCf() {
        return cf_;
    }
    public void setCf(EditText cf) {
        if(cf.length() == 0) {
            cf_ = 0;
        }
        else {
            cf_ = Short.parseShort(cf.getText().toString());
        }
    }
    public short getPwrstr() {
        return pwrstr_;
    }
    public void setPwrstr(EditText pwrstr) {
        if(pwrstr.length() == 0) {
            pwrstr_ = 0;
        }
        else {
            pwrstr_ = Short.parseShort(pwrstr.getText().toString());
        }
    }
    public short getsMon() {
        return sMon;
    }
    public void setsMon(EditText sixMon) {
        sMon = checkBlank(sixMon);
    }
    public short getOneYr() {
        return oneYr;
    }
    public void setOneYr(EditText oneYear) {
        oneYr = checkBlank(oneYear);
    }
    public short getThreeYr() {
        return threeYr;
    }
    public void setThreeYr(EditText threeYear) {
        threeYr = checkBlank(threeYear);
    }
    public short getFiveYr() {
        return fiveYr;
    }
    public void setFiveYr(EditText fiveYear) {
        fiveYr = checkBlank(fiveYear);
    }
    public short getSpecial() {
        return spAlign;
    }
    public void setSpecial(EditText special) {
        spAlign = checkBlank(special);
    }
    public short getPolicy() {
        return poAlign;
    }
    public void setPolicy(EditText policy) {
        poAlign = checkBlank(policy);
    }
    public double getHoursWorked(){
        return hoursWorked;
    }
    public void setHoursWorked(EditText hoursWorked) {
        this.hoursWorked = checkBlank(hoursWorked);
    }


    public double FluidServices(EditText lof, EditText brake, EditText fuelsys, EditText pwrstr, EditText trans, EditText diff,
                                EditText tCase, EditText ac, EditText cf) {

        setLof(lof);
        setBrake(brake);
        setFuelsys(fuelsys);
        setPwrstr(pwrstr);
        setTrans(trans);
        setDiff(diff);
        settCase(tCase);
        setAc(ac);
        setCf(cf);


        double workHours = ((getLof() * 18) + ((getCf() + getBrake() + getFuelsys() + getPwrstr() +
                getTrans() + getDiff() + gettCase())* 36) + (getAc() * 60))/60;

        return workHours;
    }
    public double TireServices(EditText mTire, EditText balance, EditText rotate, EditText flats, EditText reset) {
        setTireBalances(balance);
        setTireMounts(mTire);
        setTireRotations(rotate);
        setTireFlatRepairs(flats);
        setTireTpmsResets(reset);
        double workMin = (
                (getTireMounts() * (0.1 * 60)) + (getTireBalances() * (0.1*60)) + (getTireRotations() *(0.2 *60)) +
                        (getTireFlatRepairs() * (0.3 * 60)) + (getTireTpmsResets() * (0.25 * 60)));
        double minToHours = workMin / 60;

        return minToHours;
    }
    public double AlignmentServices(EditText sixMonth, EditText oneYear, EditText threeYear, EditText fiveYear, EditText spec, EditText poly) {
        setsMon(sixMonth);
        setOneYr(oneYear);
        setThreeYr(threeYear);
        setFiveYr(fiveYear);
        setSpecial(spec);
        setPolicy(poly);

        double workHours = (
                ((getOneYr() + getsMon() + getThreeYr() + getFiveYr()) * 60) + (getSpecial() * (1.2 * 60)) + (getPolicy() * (0.75*60))
        )/60;

        return workHours;
    }
    public double MiscServices(EditText airFilter, EditText cabin, EditText wiper, EditText bulb, EditText battCorr, EditText battInstall, EditText padsRot, EditText adjust) {
        setAirFilter(airFilter);
        setCabinFilter(cabin);
        setWiperBlades(wiper);
        setMiniBulb(bulb);
        setBatteryCorrosion(battCorr);
        setBatteryInstall(battInstall);
        setBrakeCleanAdjust(adjust);
        setPadsAndRotors(padsRot);

        double workHours = (
                (getAirFilter() * (.1*60)) + (getCabinFilter() * (.25*60)) +(getWiperBlades() * (.05*60)) + (getMiniBulb() * (.2*60)) + (getBatteryCorrosion() * (.1*60)) +
                        (getBatteryInstall() * (.25*60)) + (getPadsAndRotors() * (1*60)) + (getBrakeCleanAdjust() * (.5*60)))/60;

        return workHours;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calc = findViewById(R.id.calculate);
        Button clear = findViewById(R.id.clear);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView res = findViewById(R.id.result);
                res.setText("");

                EditText hours = (EditText) findViewById((R.id.numWorkHours));
                hours.setText("");
                EditText tires = (EditText) findViewById(R.id.numMountedTire);
                tires.setText("");
                EditText balances = (EditText) findViewById(R.id.numBalancedTire);
                balances.setText("");
                EditText rotates = (EditText) findViewById(R.id.numRotations);
                rotates.setText("");
                EditText repairs = (EditText) findViewById(R.id.numFlatRepairs);
                repairs.setText("");
                EditText tpms = (EditText) findViewById(R.id.numTpmsReset);
                tpms.setText("");

                EditText lof = (EditText) findViewById(R.id.numLof);
                lof.setText("");
                EditText brakes = (EditText) findViewById(R.id.numBrakeFluid);
                brakes.setText("");
                EditText fuel = (EditText) findViewById(R.id.numFuelSystem);
                fuel.setText("");
                EditText pwrstr = (EditText) findViewById(R.id.numPowerSteering);
                pwrstr.setText("");
                EditText trans = (EditText) findViewById(R.id.numPowerSteering2);
                trans.setText("");
                EditText diff = (EditText) findViewById(R.id.numDifferential);
                diff.setText("");
                EditText tCase = (EditText) findViewById(R.id.numTransferCases2);
                tCase.setText("");
                EditText ac = (EditText) findViewById(R.id.numTransferCases);
                ac.setText("");
                EditText co = (EditText) findViewById(R.id.numCoolantFlush);
                co.setText("");

                EditText sm = (EditText) findViewById(R.id.numSixMonths);
                sm.setText("");
                EditText oy = (EditText) findViewById(R.id.numOneYear);
                oy.setText("");
                EditText ty = (EditText) findViewById(R.id.numOneYear2);
                ty.setText("");
                EditText fy = (EditText) findViewById(R.id.numOneYear3);
                fy.setText("");
                EditText sp = (EditText) findViewById(R.id.numSpecialty);
                sp.setText("");
                EditText po = (EditText) findViewById(R.id.numPolicy);
                po.setText("");

                EditText af = (EditText)  findViewById(R.id.numAirFilter);
                af.setText("");
                EditText cf = (EditText) findViewById(R.id.numCabinFilter);
                cf.setText("");
                EditText wip = (EditText) findViewById(R.id.numWiperBlades);
                wip.setText("");
                EditText bulb = (EditText) findViewById(R.id.numWiperBlades2);
                bulb.setText("");
                EditText bc = (EditText) findViewById(R.id.numCorrosion);
                bc.setText("");
                EditText bi = (EditText) findViewById(R.id.numBatteries);
                bi.setText("");
                EditText pr = (EditText)  findViewById(R.id.numPadsRotors);
                pr.setText("");
                EditText ad = (EditText)  findViewById(R.id.numBrakeClean);
                ad.setText("");
            }
        });

        calc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TextView res = findViewById(R.id.result);
                String errorMessage = "Cannot divide by zero. Change hours worked.";
                double hoursWorked;

                EditText hours = (EditText) findViewById((R.id.numWorkHours));
                setHoursWorked(hours);

                /*
                if(hours.length() == 0) hours_ = 0;
                else hours_ = Double.parseDouble(hours.getText().toString());*/

                EditText tires = (EditText) findViewById(R.id.numMountedTire);
                EditText balances = (EditText) findViewById(R.id.numBalancedTire);
                EditText rotates = (EditText) findViewById(R.id.numRotations);
                EditText repairs = (EditText) findViewById(R.id.numFlatRepairs);
                EditText tpms = (EditText) findViewById(R.id.numTpmsReset);

                EditText lof = (EditText) findViewById(R.id.numLof);
                EditText brakes = (EditText) findViewById(R.id.numBrakeFluid);
                EditText fuel = (EditText) findViewById(R.id.numFuelSystem);
                EditText pwrstr = (EditText) findViewById(R.id.numPowerSteering);
                EditText trans = (EditText) findViewById(R.id.numPowerSteering2);
                EditText diff = (EditText) findViewById(R.id.numDifferential);
                EditText tCase = (EditText) findViewById(R.id.numTransferCases2);
                EditText ac = (EditText) findViewById(R.id.numTransferCases);
                EditText co = (EditText) findViewById(R.id.numCoolantFlush);

                EditText sm = (EditText) findViewById(R.id.numSixMonths);
                EditText oy = (EditText) findViewById(R.id.numOneYear);
                EditText ty = (EditText) findViewById(R.id.numOneYear2);
                EditText fy = (EditText) findViewById(R.id.numOneYear3);
                EditText sp = (EditText) findViewById(R.id.numSpecialty);
                EditText po = (EditText) findViewById(R.id.numPolicy);

                EditText af = (EditText)  findViewById(R.id.numAirFilter);
                EditText cf = (EditText) findViewById(R.id.numCabinFilter);
                EditText wip = (EditText) findViewById(R.id.numWiperBlades);
                EditText bulb = (EditText) findViewById(R.id.numWiperBlades2);
                EditText bc = (EditText) findViewById(R.id.numCorrosion);
                EditText bi = (EditText) findViewById(R.id.numBatteries);
                EditText pr = (EditText)  findViewById(R.id.numPadsRotors);
                EditText ad = (EditText)  findViewById(R.id.numBrakeClean);

                double tireHours = TireServices(tires,balances,rotates,repairs,tpms);
                double fluidHours = FluidServices(lof,brakes,fuel,pwrstr,trans,diff,tCase,ac,co);
                double alignHours = AlignmentServices(sm,oy,ty,fy,sp,po);
                double miscHours = MiscServices(af,cf,wip,bulb,bc,bi,pr,ad);

                double billedHours = tireHours + fluidHours + alignHours + miscHours;
                double workHours = (billedHours/getHoursWorked())*100;

                if(Double.isInfinite(workHours)) {
                    Toast errorToast = Toast.makeText(MainActivity.this, errorMessage,Toast.LENGTH_LONG);
                    errorToast.show();
                }

                res.setText(String.format("Billed hours: %.2f\n" + "Hours Worked: %.2f\n" +
                        "Percent: %%%.2f", billedHours,getHoursWorked(), workHours));

            }
        });
    }
}