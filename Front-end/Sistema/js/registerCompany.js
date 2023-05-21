document.getElementById("cadastroForm").addEventListener("submit", function(event) {
    event.preventDefault(); 
    
    //data
    var name = document.getElementById("nome").value;
    var cnpj = document.getElementById("cnpj").value;

    //adress
    var cep = document.getElementById("cep").value;
    var logradouro = document.getElementById("rua").value;
    var numero = document.getElementById("numero").value;
    var complemento = document.getElementById("complemento").value;
    var bairro = document.getElementById("bairro").value;
    var cidade = document.getElementById("cidade").value;
    var estado = document.getElementById("estado").value;


    var data = {
        name:name, 
        cnpj:cnpj,
        adress:{
        cep:cep,
        logradouro:logradouro,
        numero:numero,
        complemento:complemento,
        bairro:bairro,
        cidade:cidade,
        estado:estado}
    };

  
    
    fetch("http://localhost:8080/empresas",{
      method: "POST",
      headers: {
        "Content-Type": "application/json"
      },
      body: JSON.stringify(data)
      
    })
    .then(function(response) {
        if (response.ok) {
          alert("Empresa cadastrada com sucesso!"); 
         
        } else {
          alert("Ocorreu um erro ao cadastrar a empresa."); 
        }
        console.log(data);
      })
      .catch(function(error) {
        console.log(error);
        alert("Ocorreu um erro ao processar a requisição."); 
      });
    });