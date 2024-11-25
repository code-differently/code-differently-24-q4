import cors from 'cors';
import fs from 'fs';
import express, {Express, Request, Response} from 'express';
import programs from './data/programs.json';
import { randomUUID, UUID } from 'crypto';
import {Program} from '../../types';

const PROGRAMS_FILE = './data/programs.json';
const UUID_PATTERN = /^[0-9a-f]{8}-[0-9a-f]{4}-[0-5][0-9a-f]{3}-[089ab][0-9a-f]{3}-[0-9a-f]{12}$/i

const app: Express = express();

app.use(express.static('public'));
app.use(express.json())
app.use(express.urlencoded({extended: true}));
app.use(cors());

app.get('/programs/:id', async (req: Request, res: Response<Program>) => {
  if (!isUuidValid(req.params.id)) {
    res.status(400).send();
    return;
  }
  const program = programs.find(p => p.id === req.params.id);

  if (!program) {
    res.status(404).send();
    return;
  }

  res.status(200).send(program);
});

function isUuidValid(uuid: string): boolean {
  return !!uuid && !!uuid.match(UUID_PATTERN);
}

app.get('/programs', async (req: Request, res: Response<Program[]>) => {
  // Send the raw data back to the client as JSON.
  res.status(200).send(programs);
});

app.post('/programs', async (req: Request<Partial<Program>>, res: Response) => {
  const newProgram = req.body;
  programs.push({id: randomUUID(), ...newProgram});
  fs.writeFile(PROGRAMS_FILE, JSON.stringify(programs, null, 2), (err) => {
    if (err) return console.log(err);
    console.log(`Updated ${PROGRAMS_FILE}`);
  });
});

const port = 4000;
app.listen(port, () => {
  console.log(`Server is running on http://localhost:${port}`);
});
