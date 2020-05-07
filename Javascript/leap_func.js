function leapyear(year)
{
return (year % 100 === 0) ? (year % 400 === 0) : (year % 4 === 0);
}

// To test years: 
console.log(leapyear(YYYY));
