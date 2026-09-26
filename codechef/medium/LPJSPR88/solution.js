const inputChar = input.trim();

let operation;
switch (inputChar) {
    case '+':
        operation = "Addition";
        break;
    case '-':
        operation = "Subtraction";
        break;
    case '*':
        operation = "Multiply";
        break;
    case '/':
        operation = "Divide";
        break;
    default:
        operation = "Invalid operator";
}

console.log(operation);