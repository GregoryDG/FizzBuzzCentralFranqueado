for (var i=1; i <= 100; i++)
{
    if (i % 15 == 0)
        console.log("CentralFranqueado");
    else if (i % 3 == 0)
        console.log("Central");
    else if (i % 5 == 0)
        console.log("Franqueado");
    else
        console.log(i);
}
