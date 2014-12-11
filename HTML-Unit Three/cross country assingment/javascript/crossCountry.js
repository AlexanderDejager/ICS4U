 function updateRefactored(button) {
     var displayName = '';
     var firstLapSeconds = 0;
     var secondLapSeconds = 0;
     var totalTimeSeconds = 0;
     var secondSplit = 0;
     var thirdSplit = 0;
     var selector = button;
     var displayName = '';
     var row = button.parentElement.parentElement;
     var rowData = row.children;
     var firstName = rowData[0].children[0].value;
     if (isEmpty(firstName)) {
         alert("please enter a first name.");
     }
     var lastName = rowData[1].children[0].value;
     if (isEmpty(lastName)) {
         alert("Please enter a last name");
     }
     var firstLap = rowData[2].children[0].value;
     if (isEmpty(firstLap)) {
         alert("Please enter a first lap.");
     }
     var secondLap = rowData[3].children[0].value;
     if (isEmpty(secondLap)) {
         alert("Please enter a second lap. ");
     }
     var totalTime = rowData[4].children[0].value;
     if (isEmpty(totalTime)) {
         alert("Please enter a total time.");
     }
     var firstTimeBreak = splitStuff(firstLap);
     var secondTimeBreak = splitStuff(secondLap);
     var totalTimeBreak = splitStuff(totalTime);

     var time = [];
     var time1 = [];
     var time2 = [];

     time = parseDecimals(firstTimeBreak);
     time1 = parseDecimals(secondTimeBreak);
     time2 = parseDecimals(totalTimeBreak);

     firstLapSeconds = toSeconds(time[0], time[1]);
     secondLapSeconds = toSeconds(time1[0], time1[1]);
     totalLapSeconds = toSeconds(time2[0], time2[1]);

     var secondSplitSeconds = secondLapSeconds - firstLapSeconds;
     var thirdSplitSeconds = totalLapSeconds - secondLapSeconds;
     secondSplit = timeConvert(secondSplitSeconds);
     thirdSplit = timeConvert(thirdSplitSeconds);
     displayName = firstName + " " + lastName;

     // we have the calculations done

     var rows = document.getElementById('inputTable');
     var rowsOut = document.getElementById('tableOutput');
     var rows1 = rows.children[0].children;
     var rows2 = rowsOut.children[0].children;

     var index = 0;
     for (k = 0; k < rows1.length; ++k) {
         if (rows1[k] == row) {
             index = k;
             rows2[k].children[0].children[0].value = displayName;
             rows2[k].children[1].children[0].value = firstLap;
             rows2[k].children[2].children[0].value = secondSplit;
             rows2[k].children[3].children[0].value = thirdSplit;
             rows2[k].children[4].children[0].value = totalTime;

             save[k][0] = displayName;
             save[k][1] = firstLap;
             save[k][2] = secondSplit;
             save[k][3] = thirdSplit;
             save[k][4] = totalTime;
         }
     }

 }

 function clean(button) {
     var rows = document.getElementById('inputTable');
     var rowsOut = document.getElementById('tableOutput');
     var rows1 = rows.children[0].children;
     var rows2 = rowsOut.children[0].children;
     var clean = " ";
     var row = button.parentElement.parentElement;
     for (k = 0; k < rows1.length; ++k) {
         if (rows1[k] == row) {
             index = k;
             rows2[k].children[0].children[0].value = clean;
             rows2[k].children[1].children[0].value = clean;
             rows2[k].children[2].children[0].value = clean;
             rows2[k].children[3].children[0].value = clean;
             rows2[k].children[4].children[0].value = clean;
         }
     }
 }

 function restore(button) {
     var rows = document.getElementById('inputTable');
     var rowsOut = document.getElementById('tableOutput');
     var row = button.parentElement.parentElement;
     var rows1 = rows.children[0].children;
     var rows2 = rowsOut.children[0].children;
     for (k = 0; k < rows1.length; ++k) {
         if (rows1[k] == row) {
             index = k;
             rows2[k].children[0].children[0].value = save[k][0];
             rows2[k].children[1].children[0].value = save[k][1];
             rows2[k].children[2].children[0].value = save[k][2];
             rows2[k].children[3].children[0].value = save[k][3];
             rows2[k].children[4].children[0].value = save[k][4];
         }
     }
     
 }

 //method that converts everything to seconds and returns the total
 function toSeconds(a, b) {
         seconds = b
         min = a
         seconds += min * 60;
         totalLapSeconds = seconds;
         return seconds;
     }
     //returns if the string is empty or null
 function isEmpty(str) {
         return (!str || 0 === str.length);
     }
     //converting the seconds back into minutes:seconds
 function timeConvert(num) {
         if (!isNaN(num)) {
             return ((parseInt(num / 60)) + (":") + ((num % 60).toFixed(2)));
         } else {
             return " ";
         }
     }
     //function splits the string on ":" for given times
 function splitStuff(str) {
         return str.split(":");
     }
     //function to parse things into decimals
 function parseDecimals(str) {
     var temp = [];
     for (var i = 0; i < str.length; i++) {
         temp[i] = parseFloat(str[i]);
     }
     return temp;
 }

