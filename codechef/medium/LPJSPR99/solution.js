const choice = input.trim();
let day;
     
  switch (choice) {
    case '1':
      day = "Monday";
      break;
    case '2':
      day = "Tuesday";
      break;
    case '3':
      day = "Wednesday";
      break;
    case '4':
      day = "Thursday";
      break;
    case '5':
      day = "Friday";
      break;
    case '6':
      day = "Saturday";
      break;
    case '7':
      day = "Sunday";
      break;
    default:
      day = null; // Handle invalid input
      break;
  }

  // Printing the result
  if (day) {
    console.log(day);
  } else {
    console.log("Invalid input");
  }
   