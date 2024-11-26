import {createServer} from './server';
import {Express} from 'express';
import request from 'supertest';

describe('Server (e2e)', () => {
  let app: Express = createServer();

  it('/programs (GET)', async () => {
    return request(app)
      .get('/programs')
      .expect(200)
      .then(res => {
        expect(res.body.length).toBe(4);
      });
  });

  it('/programs/:id (GET)', async () => {
    return request(app)
      .get('/programs/516190b1-89cf-4e75-858a-11e728034022')
      .expect(200)
      .then(res => {
        expect(res.body).toEqual({
          id: '516190b1-89cf-4e75-858a-11e728034022',
          title: 'Pipeline DevShops',
          description:
            'Pipeline DevShop is a youth work-based learning program. Youth participants experience working in a real software development environment while sharpening their technology and soft skills.',
        });
      });
  });
});
