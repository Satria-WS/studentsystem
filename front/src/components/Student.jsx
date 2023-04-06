import React, { useState } from "react";
import { makeStyles } from "@material-ui/core/styles";
import TextField from "@material-ui/core/TextField";
import { Container, Paper, Button } from "@material-ui/core";

const useStyles = makeStyles((theme) => ({
  root: {
    "& > *": {
      margin: theme.spacing(1),
    },
  },
}));

export default function Student() {
  const paperStyle = { padding: "50px 20px", width: 600, margin: "20px auto" };

  //nim|name|class|major|date_birth|total_sks|status|
  const classes = useStyles();

  const [name, setName] = useState("");
  //const [address, setAddress] = useState("");
  const [kelas, setKelas] = useState("");
  const [major, setMajor] = useState("");
  const [date, setDate] = useState("");
  const [totalSks, settotalSks] = useState("");
  const [status, setStatus] = useState("");

  const handleClick = (e) => {
    e.preventDefault();
    const student = { name, kelas, major, date, totalSks, status };
    console.log(student);

    fetch("http://localhost:8080/student/add", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(student),
    }).then(() => {
      console.log("Student added Succesfully");
    });
  };
  //nim|name|class|major|date_birth|total_sks|status|
  return (
    <Container>
      <Paper elevation={3} style={paperStyle}>
        <h1 style={{ color: "blue" }}>add student</h1>
        <form className={classes.root} noValidate autoComplete="off">
          <TextField
            id="standard-basic"
            label="Student Name"
            variant="outlined"
            fullWidth
            value={name}
            onChange={(e) => setName(e.target.value)}
          />
          {/* <TextField
            id="filled-basic"
            label="Class"
            variant="outlined"
            fullWidth
            value={address}
            onChange={(e) => setAddress(e.target.value)}
          /> */}
          <TextField
            id="filled-basic"
            label="Kelas"
            variant="outlined"
            fullWidth
            value={kelas}
            onChange={(e) => setKelas(e.target.value)}
          />
          <TextField
            id="filled-basic"
            label="Jurusan"
            variant="outlined"
            fullWidth
            value={major}
            onChange={(e) => setMajor(e.target.value)}
          />{" "}
          <TextField
            id="filled-basic"
            label="Tanggal Lahir"
            variant="outlined"
            fullWidth
            value={date}
            onChange={(e) => setDate(e.target.value)}
          />{" "}
          <TextField
            id="filled-basic"
            label="Total SKS"
            variant="outlined"
            fullWidth
            value={totalSks}
            onChange={(e) => settotalSks(e.target.value)}
          />
          <TextField
            id="filled-basic"
            label="Status"
            variant="outlined"
            fullWidth
            value={status}
            onChange={(e) => setStatus(e.target.value)}
          />
          <Button variant="contained" color="secondary" onClick={handleClick}>
            Submit
          </Button>
        </form>
      </Paper>
    </Container>
  );
}
