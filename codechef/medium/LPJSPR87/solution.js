const inputChar = input.trim().toLowerCase();

let result;
switch (inputChar) {
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
        result = "Vowel";
        break;
    default:
        result = "Consonant";
}

console.log(result);